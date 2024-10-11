package com.lambda.ejercicio2;

public class LambdaTest2 {
    public static void main(String[] args) {
        Operaciones op = (num1, num2) -> System.out.println(num1 + num2);
        //op.imprimeSuma(15,30);
        op.imprimeOperacion(15,30);

        LambdaTest2 objeto = new LambdaTest2();
        //objeto.miMetodo(op, 25, 30);
        objeto.miMetodo((num, num2) -> System.out.println(num + num2), 25, 30);
    }

    public void miMetodo(Operaciones op, int num1, int num2){
        //op.imprimeSuma(num1,num2);
        op.imprimeOperacion(num1,num2);
    }
}
