package com.softtek.presentacion.Ej4;
import com.softtek.modelo.Ej4.InstrumentoMusical;
public class EjemploUso4 {
        public static void main(String[] args) {
            InstrumentoMusical guitarra = new Guitarra("Fender", "Nylon");

            InstrumentoMusical platillos = new Bateria("Yamaha", 5);

            InstrumentoMusical travesera = new Flauta("Pearl", "Madera");

            InstrumentoMusical[] instrumentos = {guitarra, platillos, travesera}

            for (InstrumentoMusical instrumento : instrumentos) {
                System.out.println("Nombre: " + instrumento.getMarca());
                System.out.println("Sonido: " + instrumento.emitirSonido());
                System.out.println();
            }
        }
}
