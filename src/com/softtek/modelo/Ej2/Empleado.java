package com.softtek.modelo.Ej2;

    public class Empleado {

        protected nombre;
        protected String nif;
        protected double salarioBase;

        public Empleado(String nombre, String nif, double salarioBase) {
            this.nombre = nombre;
            this.nif = nif;
            this.salarioBase = salarioBase;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNif() {
            return nif;
        }

        public void setNif(String nif) {
            this.nif = nif;
        }

        public double getSalarioBase() {
            return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
        }

        public abstract double calcularNomina();
    }

