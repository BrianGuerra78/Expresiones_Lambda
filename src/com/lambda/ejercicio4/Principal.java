package com.lambda.ejercicio4;

public class Principal {
    public static void main(String[] args) {
        //Forma 1
        engine((CalculadorLong) (x,y) -> x + y);
        //Forma2
        engine((long x,long y) -> x + y);
        //Forma3
        CalculadoraInt calInt = ((x,y) -> x + y);
        engine(calInt);

        CalculadorLong calLong = ((x,y) -> x + y);
        engine(calLong);

    }

    public static void engine(CalculadoraInt cal){

    }

    public static void engine(CalculadorLong cal){

    }
}
