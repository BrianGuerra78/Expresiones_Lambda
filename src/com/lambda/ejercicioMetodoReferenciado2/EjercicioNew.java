package com.lambda.ejercicioMetodoReferenciado2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EjercicioNew {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("10","10","15","15","25","30","40","6","30");

        //getResults(numeros, (numeroEnString) -> new Integer(numeroEnString));
        System.out.println("Forma1");
        getResults(numeros, Integer::new).forEach(num -> System.out.println(num * 10));
        System.out.println("Forma2");
        getResults(numeros, Integer::new).forEach(num -> EjercicioNew.multiplicarPor10(num));
        System.out.println("Forma3");
        getResults(numeros, Integer::new).forEach(EjercicioNew::multiplicarPor10);
    }
    public static List<Integer> getResults(List<String> datos, Function<String,Integer> func){
        List<Integer> resultados = new ArrayList<>();
        datos.forEach(strNum -> resultados.add(func.apply(strNum)));
        return  resultados;
    }

    public static void multiplicarPor10(int numero){
        System.out.println("El numero valor del dato " + numero + " es: " + numero*10);
    }
}
