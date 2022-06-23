package Ejercicio02;

import java.util.Random;

public class Password {

    Random rd = new Random();
    String contraseña;
    int longitud = rd.nextInt(15) + 10;

    public Password() {

        this.contraseña = generarPassword();

    }

    public Password(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean esFuerte(String contraseña) {
        int cuentanumeros = 0;
        int cuentaminusculas = 0;
        int cuentamayusculas = 0;
        int cuentaSignos = 0;
        // Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i = 0; i < contraseña.length(); i++) {
            if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
                cuentaminusculas++;
            } else {
                if (contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
                    cuentamayusculas++;
                } else {
                    if (contraseña.charAt(i) >= 48 && contraseña.charAt(i) <= 58) {
                        cuentaSignos++;
                    } else {
                        cuentanumeros++;
                    }
                }
            }
        }

        if (longitud >= 8 && cuentanumeros >= 1 && cuentaminusculas >= 1 && cuentamayusculas >= 1
                && cuentaSignos >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public String generarPassword() {
        String password = "";
        while (!esFuerte(password)) {
            for (int i = 0; i < rd.nextInt(15) + 10; i++) {
                // Generamos un numero aleatorio, segun este elige si añadir una minuscula,
                // mayuscula, numero o signo
                int eleccion = ((int) Math.floor(Math.random() * 4 + 1));
                if (eleccion == 1) {
                    char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
                    password += minusculas;
                } else {
                    if (eleccion == 2) {
                        char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
                        password += mayusculas;
                    } else {
                        if (eleccion == 3) {
                            char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
                            password += numeros;
                        } else {
                            char signos = (char) ((int) Math.floor(Math.random() * (47 - 33) + 33));
                            password += signos;
                        }
                    }
                }
            }

        }
        return password;
    }

    public String getPassword() {

        return contraseña;
    }
}
