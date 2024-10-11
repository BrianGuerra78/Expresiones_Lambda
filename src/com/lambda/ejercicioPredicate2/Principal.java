package com.lambda.ejercicioPredicate2;

import com.lambda.ejercicioPredicate2.Empleado;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/*
* Se requiere obtener un reporte con todos los empleados que cumplan con alguno de estos dos conjuntos de criterios:
* 1) 25 años en adelante y que esten en el departamento de ventas
* 2) 25 años en adelante y que esten en mostrador.
* */
public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Rodrigo", 25, 1500,"Cobranzas"),
                new Empleado("Alicia", 25, 1500,"Ventas"),
                new Empleado("Manolo", 30, 1500,"Ventas"),
                new Empleado("Cinthya", 20, 2500,"Mostrador"),
                new Empleado("Esteban", 19, 7000,"ventas"),
                new Empleado("Damaris", 32, 600,"Telemarketing"),
                new Empleado("Lina", 25, 2500,"Mostrador"),
                new Empleado("Rogelio", 25, 1500,"Cobranzas"),
                new Empleado("Cesar", 25, 1500,"Cobranzas"),
                new Empleado("Jose", 25, 1500,"Cobranzas")
        );

        Evaluador evaluador = new Evaluador();
        BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> (edad >= 25) &&(departamento.equals("Ventas"));
        BiPredicate<Integer, String> segundoCriterio = (edad, departamento) -> (edad >= 25) &&(departamento.equals("Mostrador"));
        BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);
        System.out.println("Empleados de mostrador o ventas igual o mayores de 25 años");

        List<Empleado> listaActualizada = evaluador.evaluar(listaEmpleados, criterio);
        for (Empleado empleado: listaActualizada){
            System.out.println("Nombre: " + empleado.getNombre() +
                    " Edad: " + empleado.getEdad() + " Departamento: " + empleado.getDepartamento());
        }
    }
}
