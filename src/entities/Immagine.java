package entities;

import interfaces.Luminosità;

public  class Immagine extends ElementoMultimedia implements Luminosità {

    //attributi

    //costruttori


    // metodi
    @Override
    public void alzaLuminosità(char[] luminositaValue) {
        Luminosità.super.AlzaLuminosità(luminositaValue);
    }

    @Override
    public void abbassaLuminosità(char[] luminositaValue) {
        Luminosità.super.AbbassaLuminosità(luminositaValue);
    }

    public void play() {

    }

}
