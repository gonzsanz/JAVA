package Ejercicio02;

import java.util.Scanner;

public class PruebaContraseña {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Password[] contraseñas = new Password[10];
        boolean[] esSegura = new boolean[contraseñas.length];

        System.out.println("Que tipo de contraseña quiere: Automatica [A] o Con valor [V]");
        String respuesta = sc.nextLine();

        if (respuesta.toUpperCase().equals("A")) {
            System.out.println(
                    "VALOR      FUERTE");

            for (int i = 0; i < contraseñas.length; i++) {
                contraseñas[i] = new Password();
                System.out.print(contraseñas[i].getPassword());
                if (contraseñas[i].esFuerte(contraseñas[i].getPassword())) {
                    esSegura[i] = true;
                    System.out.println("    " + esSegura[i]);
                }
            }
        } else if (respuesta.toUpperCase().equals("V")) {
            System.out.println("Introduce la contraseña que desea");
            String clave = sc.nextLine();
            System.out.println(
                    "VALOR      FUERTE");
            Password contraseñas2 = new Password(clave);
            System.out.println(contraseñas2.getPassword());
            if (contraseñas2.esFuerte(contraseñas2.getPassword())) {
                esSegura[0] = true;
                System.out.println("    " + esSegura[0]);
            }
        }
        sc.close();
    }
}
