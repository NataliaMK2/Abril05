package com.softtek.modelo.Ej1;

import java.time.LocalDate;

    public class ProductoPerecedero extends Producto {

        private LocalDate fCaducidad;
        private LocalDate fFabricacion;

        public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fCaducidad, LocalDate fFabricacion) {
            super(nombre, cantidad, pvp);
            this.fCaducidad = fCaducidad;
            this.fFabricacion = fFabricacion;
        }

        public LocalDate getfCaducidad() {
            return fCaducidad;
        }

        public void setfCaducidad(LocalDate fCaducidad) {
            this.fCaducidad = fCaducidad;
        }

        public LocalDate getfFabricacion() {
            return fFabricacion;
        }

        public void setfFabricacion(LocalDate fFabricacion) {
            this.fFabricacion = fFabricacion;
        }

        @Override
        public double cantidadAPagar() {
            if (fCaducidad.isBefore(LocalDate.now())) {
                return 0;
            } else {
                return cantidad * pvp;
            }
        }

        public int tiempoCosumision() {
            return fCaducidad.compareTo(fFabricacion);
        }

}
