/*
 * Realizar un programa que muestre el valor de una factura telefónica sabiendo que cada paso consumido se cobra a 0.10 Euros 
 * y que cuando se consumen más de 1000 pasos se aplica un descuento del 18 % sobre el total de la factura. 
 * El número de pasos consumidos se solicita al usuario. Hay que chequear que este valor siempre es mayor que 0.
 */

import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pasos;
		float importe;
		do {
			System.out.println("Introduce el número de pasos");
			pasos = sc.nextInt();	
		}
		while (pasos < 0);
		
		importe = pasos * 0.10f;
		
		if (pasos > 1000) {
			importe = importe - ((importe * 18)/100);
		}
		
		System.out.println("El importe es " + importe);
		
		sc.close();
	}

}
