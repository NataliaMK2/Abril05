package com.softtek.presentacion.Ej3;
import com.softtek.modelo.Ej3.Cuadrado;
import com.softtek.modelo.Ej3.Figura;
import com.softtek.modelo.Ej3.Triangulo;
public class EjemploUso {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setLado(5);

        Figura mediano = new Cuadrado();
        ((Cuadrado)mediano).setLado(8);

        Triangulo teque = new Triangulo();
        teque.setBase(6);
        teque.setAltura(4);

        Figura mediano2 = new Triangulo();
        ((Triangulo)mediano2).setBase(10);
        ((Triangulo)mediano2).setAltura(5);

        Figura[] figuras = {cPeque, mediano, teque, mediano2};

        for (Figura figura : figuras) {
            System.out.println("Área de la figura: " + figura.calcularArea());
        }
    }
}
