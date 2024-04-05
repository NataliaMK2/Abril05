package com.softtek.presentacion.Ej2;
import com.softtek.modelo.Ej2.Empleado;
import com.softtek.modelo.Ej2.Gerente;
import com.softtek.modelo.Ej2.Operador;
import com.softtek.modelo.Ej2.Vendedor;
public class EjemploUso2 {
    public static void main(String[] args) {

        Trabajador[] trabajadores = new Trabajador[]{
                new Gerente("Natalia", "12345678A", 1500.0, 300.0),
                new Vendedor("Marta", "87654322B", 1200.0, 5000.0, 0.1),
                new Operador("Pedro", "98765452C", 1000.0, 100, 0.5)
        };
        for (Trabajador trabajador : trabajadores) {
            System.out.println("Nombre: " + trabajador.getNombre());
            System.out.println("Nómina: " + trabajador.calcularNomina());
            System.out.println();
        }
    }
    }
