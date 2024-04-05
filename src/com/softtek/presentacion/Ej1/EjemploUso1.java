package com.softtek.presentacion.Ej1;

import com.softtek.modelo.Ej1.Producto;
import com.softtek.modelo.Ej1.ProductoPerecedero;

import java.time.LocalDate;


public class EjemploUso1 {
    public static void main(String[] args) {
        ProductoPerecedero("Leche", 1, 1.5, LocalDate.now().plusDays(5), LocalDate.now());
    }
            System.out.println("Cantidad a pagar: " + p1.cantidadAPagar());

    Producto p2 = new ProductoPerecedero("Pan", 2, 2.0, LocalDate.now().minusDays(2), LocalDate.now());
            System.out.println("Cantidad a pagar: " + p2.cantidadAPagar());

}
