/*
 * Mostrar el siguiente menú que se repetirá hasta que usuario seleccione  la opción  de terminar. 
 * Si el usuario elige 1,el programa mostrará el mensaje “Hola” si elige la opción 2 mostrará el mensaje “Adiós”. 
 * Si elige la opción 3 se mostrará cuantos saludos y despedidas ha realizado el programa.
 */

import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num = 0;
		int contSaludo = 0;
		int contDespedida = 0;
		
		do {
			System.out.print("1.-Saludar \n2.-Despedirse \n3.Terminar \nElegir opción[1-3]:");
			num = numero.nextInt();

			if (num == 1) {
				contSaludo++; 
				System.out.println("\nHola\n");
			}
			if (num == 2) {
				contDespedida++;
				System.out.println("\nAdiós\n");
			}
			if (num == 3) {
				System.out.println("\nTotal de saludos\n = " + contSaludo);	
				System.out.println("\nTotal de saludos\n = " + contDespedida);	
			}
			if (num < 0 || num > 3) {
				System.out.println("\nOpción errónea\n");
			}
		}
		while (num != 3);

		numero.close();
	}

}
