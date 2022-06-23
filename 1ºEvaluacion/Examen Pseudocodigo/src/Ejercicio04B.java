/*
 * Mostrar el siguiente menú que se repetirá hasta que usuario seleccione  la opción  de terminar. 
 * Si el usuario elige 1,el programa mostrará el mensaje “Vino” si elige la opción 2 mostrará el mensaje “Jamón”. 
 * Si elige la opción 3 se mostrará cuantas bebidas y comidas  se han realizado.
 */

import java.util.Scanner;
public class Ejercicio04B {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num = 0;
		int contBebida = 0;
		int contComida = 0;
		
		
		do {
			System.out.print("1.-Beber \n2.-Comer \n3.Terminar \nElegir opción[1-3]:");
			num = numero.nextInt();
			switch (num){
			case 1: System.out.println("\nVino\n");
				contBebida++;
				break;
			case 2: System.out.println("\nJamón\n");
				contComida++;
				break;
			case 3: System.out.println("\nAdiós\n");
				break;
			default: System.out.println("\nOperación errónea\n");
			}
		}
		while (num != 3);
		System.out.println("Total de bebidas: " + contBebida);
		System.out.println("Total de comidas: " + contComida);

		numero.close();
	}

}
