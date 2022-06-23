//Realizar un programa en Java que lea un secuencia de números enteros, el programa termina cuando el
//número introducido sea igual a cero. El programa tiene que mostrar a continuación cual es la media del total
//de los números introducidos sin contar el 0 y la cantidad de los números que han sido divisibles entre 3 y
//5. Se supone que como mínimo habrá un número distinto de cero.

import java.util.Scanner;
public class E2019_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		int num;
		int contador = 0, entre3 = 0, entre5 = 0;
		double media;
		
		System.out.println("Introduce números enteros o 0 para terminar");
		do {
			num = sc.nextInt();
			if (num > 0) {
				contador++;
			}
			else {
				if (num % 3 == 0) {
					entre3++;
				}
				if (num % 5 == 0) {
					entre5++;
				}
			}

			suma = suma + num;
		}
		while (num != 0);
		
		media = suma / contador;
		
		System.out.println("La media es: " + media);
		System.out.println("Numeros divisibles entre 3 es: " + entre3);
		System.out.println("Numeros divisibles entre 5 es: " + entre5);

		sc.close();
	}

}
