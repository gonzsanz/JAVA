package Ejercicio03;

import java.util.Random;

public class TestCafetera {

    public static void main(String[] args) {
        Random rd = new Random();

        Cafetera[] aCafetera = new Cafetera[4];
        aCafetera[0] = new Cafetera(2000);
        aCafetera[1] = new Cafetera(1000);
        aCafetera[2] = new Cafetera(1500);
        aCafetera[3] = new Cafetera(1000);

        for (int i = 0; i < aCafetera.length; i++) {
            aCafetera[i].llenarCafetera();
            aCafetera[i].servirTaza(rd.nextInt(100));
            aCafetera[i].agregarCafe(rd.nextInt(100));
        }


        mostrarInforme(aCafetera);
    }

    static void mostrarInforme(Cafetera[] cafeteras) {

        System.out.println("""
                -----------------------------------------
                        Estado Actual de Cafeteras:
                -----------------------------------------
                N°   Cantidad Actual     Capacidad máxima
                """);
        for (int i = 0; i < cafeteras.length; i++) {
            System.out.print(i + 1);
            System.out.printf("%10d ", cafeteras[i].cantidadActual);
            System.out.printf("%20d ", cafeteras[i].capacidadMaxima);
            System.out.println();
        }
    }

    
}
