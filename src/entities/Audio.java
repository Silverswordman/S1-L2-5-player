package entities;

import interfaces.PlayAndVolume;

public class Audio extends ElementoMultimedia implements PlayAndVolume {


    //attributi
    private String title;
    private int durata;
    private char[] volumeValue;

    // Costruttori
    public Audio(int durata, char[] volumeValue) {
        this.durata = durata;
        this.volumeValue = PlayAndVolume.volumeValue;
    }


    // metodi
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
    public void play() {
        System.out.println("Play the audio");
    }

}





