package Leerlineas;

public class BurradasNOException extends Exception {

    public BurradasNOException(String msg) {
        super("Error. No se permite lenguaje obsceno\nPalabra utilizada: " + msg);
    }

}