package interfaces;

public interface PlayAndVolume {

    //Attributi

    int durata = 0;

    char[] volumeValue = {'!', '!', '!', '!', '!'};

    //metodi

    public default void alzaIlVolume(char[] volumeValue) {


    }

    public default void abbassaIlVolume(char[] volumeValue) {

    }

    public default void play() {

    }



}
