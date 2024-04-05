package com.softtek.modelo.Ej4;

public class Bateria extends InstrumentoMusical {

    private int noPlatillos;

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public void setNoPlatillos(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }

    @Override
    public String emitirSonido() {
        return "Sonido de batería con " + noPlatillos + " platillos";
    }
}