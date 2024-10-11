package com.lambda.ejercicioFunction2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales {
    public static void main(String[] args) {
        List<Comensal> listaComensales = Arrays.asList(new Comensal("Javier", 10,5),
                new Comensal("Javier", 10,5),
                new Comensal("Javier", 10,5),
                new Comensal("Javier", 10,5),
                new Comensal("Javier", 10,5),
                new Comensal("Javier", 10,5),
                new Comensal("Javier", 10,5));

        List<Object> nombresComensales = getDatosComensales(listaComensales, x -> x.getNombre());
        System.out.println("La Lista de comensales es: ");
        for (Object nombreComensal : nombresComensales){
            System.out.println("El nombre es: " + nombreComensal);
        }

        List<Object> montosComensales = getDatosComensales(listaComensales, x -> x.getMonto_pedido());
        for (Object monto : montosComensales){
            System.out.println("El monto es: " + monto);
        }
    }

    public static List<Object> getDatosComensales(List<Comensal> listaCom, Function<Comensal, Object> func){
        //Esta lista guardara datos personales de los comensales
        List<Object> listaDatos = new ArrayList<>();

        //Iterar atraves de la lista de comensales que recibimos
        for (Comensal comensal: listaCom){
            listaDatos.add(func.apply(comensal));
        }
        return listaDatos;
    }
}
