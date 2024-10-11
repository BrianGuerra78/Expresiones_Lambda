package com.lambda.ejercicioComparator;


import java.util.Comparator;

public class OrdenarPersonaPorId implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2){
        return p1.getIdPersona() - p2.getIdPersona();
    }
}
