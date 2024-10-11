package com.lambda.ejercicioMetodoReferenciado;

public class ProvedorComparaciones {
    public int compararPorNombre(Persona per1, Persona per2){
        return per1.getNombre().compareTo(per2.getNombre());
    }

    public int compararPorEdad(Persona per1, Persona per2){
        return per1.getEdad().compareTo(per2.getEdad());
    }
}
