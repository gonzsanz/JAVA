package Ejercicio07;

import java.util.Scanner;


public class TestNIF {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos dni quieres: ");
        int cantidad = sc.nextInt();
        sc.close();
        for (int i=0; i < cantidad; i++){
            
            Nif dni = new Nif((long) Math.floor(Math.random()*(00000000-99999999+1)+99999999));
            System.out.println(dni.escribir());
        }
    }


    
}
