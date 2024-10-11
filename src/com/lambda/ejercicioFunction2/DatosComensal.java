package com.lambda.ejercicioFunction2;

import java.util.function.Function;

public class DatosComensal {
    public static void main(String[] args) {
        Comensal com1 = new Comensal("Javier", 256.2, 5);
        String nombreCom = (String) getDatoComensal(com1, x -> x.getNombre());
        System.out.println("El nombre del comensal es: " + nombreCom);

        int mesa = (int) getDatoComensal(com1, x -> x.getMesa());
        System.out.println("La mesa del comensal es: " + mesa);
    }

    public static Object getDatoComensal(Comensal com, Function<Comensal,Object> func){
        return func.apply(com);
    }
}
