package com.lambda.ejercicioFunction2;

public class Comensal {
    String nombre;
    double monto_pedido;
    int mesa;

    public Comensal(String nom, double mon, int mesa){
        this.nombre = nom;
        this.monto_pedido = mon;
        this.mesa = mesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto_pedido() {
        return monto_pedido;
    }

    public void setMonto_pedido(double monto_pedido) {
        this.monto_pedido = monto_pedido;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}
