/*
 * Elaborar un programa que muestre el precio de un billete de autobús, que se calcula en base a los kilómetros de trayecto ( 0.30 Euros por Km ),
 * pero si el recorrido supera los 80 Km se aplica un 15 % de descuento y que si el trayecto se realiza en día laborable (‘L’) 
 * hay un 5 % de descuento respecto si es día festivo (‘F’). Datos a introducir: kilómetros de recorrido y tipo de día.
 */

import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int km;
		int descuento = 0;
		float precio;
		char dia;
		
		System.out.println("Introducir km :");
		km = entrada.nextInt();
		System.out.println("Introducir tipo de dia (F o L) :");
		dia = entrada.next().charAt(0);
		
		if (km >= 80) {
			descuento = descuento + 15;
		}
		if (dia == 'L' || dia == 'l') {
			descuento = descuento + 5;
		}
		
		precio = km * 0.30f;
		precio = precio - ((precio * descuento)/100);
		
		System.out.println("El precio es: " + precio);
		

		entrada.close();
	}

}
