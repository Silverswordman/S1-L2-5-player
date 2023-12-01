package interfaces;

public interface PlayAndVolume {

    //Attributi

    int durata = 0;
    char[] volumeValue = new char[5];


    //metodi

    public default void alzaIlVolume(char[] volumeValue) {

    }

    public default void abbassaIlVolume(char[] volumeValue) {

    }

    public default void play(int durata) {

    }


}
