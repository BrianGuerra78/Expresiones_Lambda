package com.lambda.ejercicioBiConsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        String[][] arreglo = {{"Cris", "USA"}, {"Raju", "India"}, {"Lynda", "Canada"}};

        for (int i = 0; i < arreglo.length; i++){
            map.put(arreglo[i][0], arreglo[i][1]);
        }
        System.out.println("Usando la forma tradicional de imprimir clave y valor de un mapa");
        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
        if (iter != null){
            while (iter.hasNext()){
                Map.Entry<String,String> entry = iter.next();
                System.out.println("Clave: " + entry.getKey() + " Valor: " + entry.getValue());
            }
        }

        //Forma actualizada
        System.out.println("\nUsando BiConsumer y expresiones lambda: ");
        map.forEach((key, value) -> System.out.println("Clave: " + key + " Valor: " + value));
    }
}
