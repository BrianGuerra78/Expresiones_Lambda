package com.lambda.ejercicioConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Principal {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
          new Estudiante("John", 6),
          new Estudiante("Mark", 5),
          new Estudiante("Felix", 5),
          new Estudiante("Patrick", 6),
          new Estudiante("James", 3),
          new Estudiante("Peter", 10),
          new Estudiante("Mathew", 10),
          new Estudiante("Paul", 9),
          new Estudiante("Judas", 4),
          new Estudiante("JTomas", 8),
          new Estudiante("Felipe", 7)
        );

       /* OperacionEstudiantes op = new OperacionEstudiantes();
        Consumer<Estudiante> cons1 = e -> System.out.println("Nombre: " + e.getNombre()
        + " Calificacion: " + e.getCalificacion());
        System.out.println("Estudiantes con calificacion actual");
        op.aceptaTodos(estudiantes,cons1);

        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion()*1.15);
        op.aceptaTodos(estudiantes,cons2);
        System.out.println("Estudiantes con calificacion actualizada");
        op.aceptaTodos(estudiantes,cons1);*/

        OperacionEstudiantes op = new OperacionEstudiantes();
        Consumer<Estudiante> cons1 = e -> System.out.println("Nombre: " + e.getNombre()
                + " Calificacion: " + e.getCalificacion());
        System.out.println("Estudiantes con calificacion actual");
        op.aceptaTodos(estudiantes,cons1);

        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion()*1.15);

        Consumer<Estudiante> cons3 = cons2.andThen(cons1);

        System.out.println("Estudiantes con calificacion actualizada");
        op.aceptaTodos(estudiantes,cons3);

    }
}
