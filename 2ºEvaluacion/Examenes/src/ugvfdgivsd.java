import java.util.Scanner;

public class ugvfdgivsd {

	public static void main(String args[]) {
		Scanner size = new Scanner(System.in);
		int tamaño, fila, columna;
		int contador = 1;
		System.out.print("Introduce el tamaño del cuadrado:");
		tamaño = size.nextInt();

		tamaño = (tamaño * 2) + 1;

		for (fila = 1; fila <=tamaño; fila++) {
			for (columna = 1; columna <= tamaño; columna++) {
				if (contador % 2 == 0) {
					System.out.print("-");
				}
				else System.out.print("+");
				contador++;
			}
			System.out.println("");
		}
	}
}
