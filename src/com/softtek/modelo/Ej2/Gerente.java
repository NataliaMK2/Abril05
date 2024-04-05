package com.softtek.modelo.Ej2;

public class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, String nif, double salarioBase, double bono) {
        super(nombre, nif, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double calcularNomina() {
        return salarioBase + bono;
    }
}
