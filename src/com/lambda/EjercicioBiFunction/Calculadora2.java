package com.lambda.EjercicioBiFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora2 {
    public List<Double> calc(BiFunction<Double,Double, Double> bi, List<Empleado> listaEmp, Double incremento){
        List<Double> listaSalarios = new ArrayList<>();
        for (Empleado empleado : listaEmp) {
            listaSalarios.add(bi.apply(empleado.getSalario(), incremento));
        }
        return listaSalarios;
    }
}
