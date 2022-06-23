import java.util.*;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor que quieras ver si se repite");
		int valor = sc.nextInt();
		int tabla[][] = new int[10][5];

		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				tabla[fila][columna] = (int) (Math.random() * 20);
				System.out.print(tabla[fila][columna] + " ");
			}
			System.out.println("");
		}

		int nums = numVecesNumero(tabla, valor);
		System.out.println();
		System.out.println("Se repite " + nums + " veces");
		
		sc.close();
	}

	// Busca un cuantas veces aparece un valor en la tabla
	static int numVecesNumero(int t[][], int nums) {
		int cont = 0;
		for (int fila = 0; fila < t.length; fila++) {
			for (int columna = 0; columna < t[fila].length; columna++) {
				if (t[fila][columna] == nums) {
					cont++;
				}
			}
		}
		return cont;
	}

}
