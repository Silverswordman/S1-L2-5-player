package entities;

import interfaces.Luminosità;
import interfaces.PlayAndVolume;

public class Video extends ElementoMultimedia implements Luminosità, PlayAndVolume {
    //attributi
    private char titolo;
    private int durata;
    private char[] volumeValue;
    private char[] luminositaValue;

    // Costruttori
    public Video(int durata, char[] volumeValue, char[] luminositaValue) {
        this.durata = durata;
        this.volumeValue = PlayAndVolume.volumeValue;
        this.luminositaValue = Luminosità.luminositàValue;
    }


    // Metodi

    @Override
    public void alzaIlVolume(char volumeValue[]) {

        if (volumeValue[volumeValue.length - 1] == '!') {
            System.out.println("Sei già al massimo del volume");
        } else {
            for (int i = 0; i < volumeValue.length; i++) {
                volumeValue[i] = '!';
            }
        }
    }

    @Override
    public void abbassaIlVolume(char volumeValue[]) {

        if (volumeValue[0] != '!') {
            System.out.println("Sei già al minimo del volume");
        } else {
            for (int i = volumeValue.length - 1; i >= 0; i--) {
                volumeValue[i] = '!';
            }
        }
    }

    @Override
    public void alzaLuminosita(char[] luminositaValue) {

        if (luminositaValue[luminositaValue.length - 1] == '*') {
            System.out.println("Sei già al massimo della luminosità");
        } else {
            for (int i = 0; i < luminositaValue.length; i++) {
                luminositaValue[i] = '*';
            }
        }
    }

    @Override
    public void abbassaLuminosità(char[] luminositaValue) {

        if (luminositaValue[0] != '*') {
            System.out.println("Sei già al minimo della luminosità");
        } else {
            for (int i = luminositaValue.length - 1; i >= 0; i--) {
                luminositaValue[i] = '*';
            }
        }
    }

    @Override
    public void play() {
        {
            System.out.println("E' partito il video " + getTitolo());
        }
    }
}


