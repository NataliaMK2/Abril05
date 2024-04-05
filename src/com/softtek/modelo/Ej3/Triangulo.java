package com.softtek.modelo.Ej3;

public class Triangulo extends Figura {
    double base;
    double altura;

    public double calcularArea() {
        return (base * altura) / 2;
    }
}