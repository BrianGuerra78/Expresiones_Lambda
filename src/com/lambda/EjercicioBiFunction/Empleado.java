package com.lambda.EjercicioBiFunction;

public class Empleado {
    String nombre;
    double salario;

    public Empleado(String nom, double sal){
        this.nombre = nom;
        this.salario = sal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
