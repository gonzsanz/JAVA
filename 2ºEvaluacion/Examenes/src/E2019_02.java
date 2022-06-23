//Realizar un programa en PSEUDOCÓDIGO que lea caracteres ( letras o dígitos ) y que termine cuando detecte que se han introducido 
//el carácter ‘6’ tres veces consecutivas, en ese caso mostrará el mensaje “El número de la bestia. 

import java.util.Scanner;
public class E2019_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		char caracter;
		System.out.println("Introduce caracteres");
		
		do {
			caracter = sc.next().charAt(0);
			if (caracter == '6') {
				contador++;
			}
			else contador = 0;
		}
		while (contador <3);
		
		System.out.println("el numero de la bestia");
		
		sc.close();
	}

}
