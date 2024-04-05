package com.softtek.modelo.Ej2;

public class Operador extends Empleado {

    private int piezas;
    private double incentivo;

    public Operador(String nombre, String nif, double salarioBase, int piezas, double incentivo) {
        super(nombre, nif, salarioBase);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public double calcularNomina() {
        return salarioBase + (piezas * incentivo);

    }
}