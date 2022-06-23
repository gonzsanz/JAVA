//Dada dos tabla Ta y Tb de N enteros, donde Ta ha sido previamente rellenada con datos, 
//indicar cuantos elementos  Ta  son divisibles  entre 5 y 7, guardando en la otra Tb  dichos números almacenados. 

import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamaño de la tabla: ");
		int cantidad = sc.nextInt();
		
		int Ta[] = new int[cantidad];
		int Tb[] = new int[cantidad];
		
		System.out.println("Introduce los valores de la Tabla A:");
		for (int i = 0; i<Ta.length; i++) {
			System.out.print("Vector ["+i+"] = ");
			Ta[i] = sc.nextInt();
			
			if(Ta[i] % 5 == 0 && Ta[i] % 7 == 0) {
				Tb[i] = Ta[i];
			}
		}
		
		System.out.println("Divisibles entre 5 y 7 almacenados en Tb");
		for (int j = 0; j<Tb.length; j++) {
			if (Tb[j] > 0) {
				System.out.print("Vector ["+j+"] = ");
				System.out.println(Tb[j]);
			}
		}

		sc.close();
	}

}
