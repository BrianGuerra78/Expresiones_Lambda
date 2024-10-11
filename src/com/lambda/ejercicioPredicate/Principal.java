package com.lambda.ejercicioPredicate;

import java.util.Arrays;
import java.util.List;

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
        System.out.println("Empleados con salario > 5000");

        List<Empleado> empSalariosAltos = evaluador.evaluar(listaEmpleados, empleado -> empleado.getSalario() > 5000);
        for ( Empleado empleado : empSalariosAltos){
            System.out.println(empleado.getNombre());
        }

        System.out.println("\nEmpleados que su nombre inicia con J: ");
        List<Empleado> empInicianConJ = evaluador.evaluar(listaEmpleados, empleado -> empleado.getNombre().startsWith("J"));
        for ( Empleado empleado : empInicianConJ){
            System.out.println(empleado.getNombre());
        }

        System.out.println("\nEmpleados jovenes: ");
        List<Empleado> empleadosJovenes = evaluador.evaluar(listaEmpleados,empleado -> empleado.getEdad() < 25);
        for ( Empleado empleado : empleadosJovenes){
            System.out.println(empleado.getNombre());
        }

        Funciones func = new Funciones();
        for (Empleado empleado : empleadosJovenes){
            double nuevoSalario = func.incrementoSalario(empleado, 10,
                    (salario, incremento)-> salario + (salario * (incremento/100)));

            empleado.setSalario(nuevoSalario);
        }

        System.out.println("\nSalarios Actualizados en los jovenes");
        for (Empleado empleado : empleadosJovenes){
            System.out.println("Nombre: " + empleado.getNombre() + " Salario: " + empleado.getSalario());
        }

        System.out.println("\nEmpleados mayores: ");
        List<Empleado> empleadosMayores = evaluador.evaluarAlContrario(listaEmpleados,empleado -> empleado.getEdad() < 25);
        for ( Empleado empleado : empleadosMayores){
            System.out.println(empleado.getNombre());
        }
    }
}
