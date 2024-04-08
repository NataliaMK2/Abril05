package com.softtek.modelo.Ej3;

public abstract class Figura {
    protected int x;
    protected int y;

    public abstract double calcularArea();

    public String mostrarPosicion() {
        return "Posición: (" + x + ", " + y + ")";
    }
}
