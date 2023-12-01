package interfaces;

public interface Luminosità {

    //Attributi
    char[] luminositaValue = new char[5];

    //Metodi

    public default void AlzaLuminosità(char[] luminositaValue) {

    }

    public default void AbbassaLuminosità(char[] luminositaValue) {

    }


    void alzaLuminosità(char luminositaValue[]);

    void abbassaLuminosità(char luminositaValue[]);
}
