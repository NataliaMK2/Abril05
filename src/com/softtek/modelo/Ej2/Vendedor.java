package com.softtek.modelo.Ej2;

public class Vendedor extends Empleado {

    private double ventas;
    private double comision;

    public Vendedor(String nombre, String nif, double salarioBase, double ventas, double comision) {
        super(nombre, nif, salarioBase);
        this.ventas = ventas;
        this.comision = comision;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double calcularNomina() {
        return salarioBase + (ventas * comision);
    }
}
