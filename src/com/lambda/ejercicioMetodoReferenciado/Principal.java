package com.lambda.ejercicioMetodoReferenciado;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Persona> personas= Arrays.asList(
                new Persona("Juan", 18, "juanito@hotmail.com"),
                new Persona("Mario", 17, "mario@hotmail.com"),
                new Persona("Arturo", 17, "arturito@hotmail.com"),
                new Persona("Beatriz", 14, "bety@hotmail.com"),
                new Persona("Olivia", 12, "oli@hotmail.com"),
                new Persona("Angel", 32, "angelito@hotmail.com"),
                new Persona("Pamela", 28, "pamelita@hotmail.com"),
                new Persona("Sadee", 25, "sadecita@hotmail.com"),
                new Persona("Jared", 12, "jaredcito@hotmail.com"),
                new Persona("Sebastian", 14, "sebastiancito@hotmail.com"),
                new Persona("Roberto", 20, "robertito@hotmail.com")
        );
        System.out.println("Personas sin ordenar: ");
        personas.forEach(p -> System.out.println(p));
        System.out.println(" ");

        Collections.sort(personas, (persona1, persona2) -> persona1.getEdad().compareTo(persona2.getEdad()));
        System.out.println("Forma1: Personas ordenadas por edad: ");
        personas.forEach(p -> System.out.println(p));
        System.out.println(" ");

        Collections.sort(personas, (persona1, persona2) -> Persona.compararPorEdad(persona1,persona2));
        System.out.println("Forma2: Personas ordenadas por edad: ");
        personas.forEach(p -> System.out.println(p));
        System.out.println(" ");

        Collections.sort(personas, Persona::compararPorEdad);
        System.out.println("Forma3: Personas ordenadas por edad: ");
        personas.forEach(p -> System.out.println(p));
        System.out.println(" ");

        ProvedorComparaciones comparador = new ProvedorComparaciones();
        //Collections.sort(personas, (p1,p2) -> comparador.compararPorNombre(p1,p2));
        Collections.sort(personas, comparador::compararPorNombre);
        System.out.println("Forma4: Personas ordenadas por edad: ");
        //personas.forEach(p -> System.out.println(p));
        personas.forEach(System.out::println);
        System.out.println(" ");

        //Collections.sort(personas, (per1,per2) -> per1.compararPorEdad2(per2));
        Collections.sort(personas, Persona::compararPorEdad2);

    }
}
