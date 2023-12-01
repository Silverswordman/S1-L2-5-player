package entities;

import interfaces.Luminosità;

public class Immagine extends ElementoMultimedia implements Luminosità {

    //attributi
    private String titolo;
    private char[] luminositàValue;


    //costruttori
    public Immagine(char[] luminositaValue) {
        this.luminositàValue = Luminosità.luminositàValue;
    }


    // metodi

    @Override
    public void alzaLuminosita(char[] luminositaValue) {
        // Verifica se è già al massimo
        if (luminositàValue[luminositàValue.length - 1] == '*') {
            System.out.println("Sei già al massimo della luminosità");
        } else {
            for (int i = 0; i < luminositàValue.length; i++) {
                luminositàValue[i] = '*';
            }
        }
    }

    @Override
    public void abbassaLuminosità(char[] luminositàValue) {
        // Verifica se è già al minimo
        if (luminositàValue[0] != '*') {
            System.out.println("Sei già al minimo della luminosità");
        } else {
            for (int i = 0; i < luminositàValue.length - 1; i++) {
                luminositàValue[i] = ' ';
            }
        }
    }

    public void show() {
        System.out.println(" Immagine stampata");
    }

    @Override
    public String toString() {
        return "Titolo: " + getTitolo() + ", Luminosità dell'immagine: " + luminositàValue;
    }
}





