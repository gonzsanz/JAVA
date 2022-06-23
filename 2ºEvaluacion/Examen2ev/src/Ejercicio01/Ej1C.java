package Ejercicio01;

public class Ej1C {
    
    public static String superEco(String cadena, int veces) {
        String str = "";

        for (int i=0; i<veces; i++){
            str += cadena;
        }
        return str;
    }
}
