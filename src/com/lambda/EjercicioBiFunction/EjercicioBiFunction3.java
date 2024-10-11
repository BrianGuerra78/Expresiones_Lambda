package com.lambda.EjercicioBiFunction;

import java.util.Arrays;
import java.util.List;

public class EjercicioBiFunction3 {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Javier", 2563.2),
                new Empleado("Arturo", 183.2),
                new Empleado("Carlos", 25633453.4),
                new Empleado("Jimena", 45390.2),
                new Empleado("Raul", 2563.2),
                new Empleado("Ramiro", 2563.2),
                new Empleado("Saul", 2544463.2),
                new Empleado("Jaime", 2562143.2),
                new Empleado("Flor", 25.2),
                new Empleado("Marina", 8762563.2)
        );

        Calculadora2 cal = new Calculadora2();
        List<Double> salarios = cal.calc((salario, incremento) -> salario + (salario * (incremento/100)), listaEmpleados, 16.0);

        for (Double salario : salarios){
            System.out.println("Salarios: " + salario);
        }
    }
}
