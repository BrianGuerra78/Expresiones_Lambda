package com.lambda.ejercicioComparator;

import java.util.*;

public class Ordenacion {
    public static void main(String[] args) {
        //Ordenacion natural de Strings con Comparable
        List<String> nombres = Arrays.asList("Carlos", "Ana", "Abias", "German");
        System.out.println("Lista antes de ordenarse: " + nombres);

        Collections.sort(nombres);
        System.out.println("Lista despues de ordenarse: " + nombres);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Mario"));
        personas.add(new Persona(2, "Fernando"));
        personas.add(new Persona(3, "Omar"));
        personas.add(new Persona(4, "Juana"));
        System.out.println("Lista de personas sin ordenar: " + personas);

        Collections.sort(personas);
        System.out.println("Lista de personas ordenada por nombre: " + personas);

        //clase anonima
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getIdPersona() - p2.getIdPersona();
            }
        });
        System.out.println("Forma1: Lista de personas ordenadas por id: " + personas);

        Collections.sort(personas, new OrdenarPersonaPorId());
        System.out.println("Forma2: Lista de personas ordenadas por id: " + personas);

        Collections.sort(personas, (p1, p2) -> p1.getIdPersona() - p2.getIdPersona());
        System.out.println("Forma3: Lista de personas ordenadas por id: " + personas);
    }
}
