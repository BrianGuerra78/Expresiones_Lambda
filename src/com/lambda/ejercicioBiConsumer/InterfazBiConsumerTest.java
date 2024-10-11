package com.lambda.ejercicioBiConsumer;

import java.util.function.BiConsumer;

public class InterfazBiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<Double, Double> biConsumer = (num1, num2) ->{
          double mult = num1 * num2;
            System.out.println("La multiplicacion es: " + mult);
        };
        biConsumer.accept(15.2,52.25);
    }
}
