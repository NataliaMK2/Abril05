package com.softtek.modelo.Ej4;

public class Flauta extends InstrumentoMusical {

    private String material;

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String emitirSonido() {
        return "Sonido de flauta de " + material;
    }
}