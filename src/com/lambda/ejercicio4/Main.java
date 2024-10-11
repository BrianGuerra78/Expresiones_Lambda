package com.lambda.ejercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println(create().calculate(2,2));
    }

    private static CalculadorLong create(){
        return (x, y) -> x/ y;
    }
}
