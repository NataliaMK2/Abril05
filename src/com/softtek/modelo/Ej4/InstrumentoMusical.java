package com.softtek.modelo.Ej4;

public abstract class InstrumentoMusical {

    protected String marca;

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public abstract String emitirSonido();

    public String getMarca() {
        return marca;
    }
}