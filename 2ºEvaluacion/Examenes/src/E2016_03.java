import java.util.Scanner;
public class E2016_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamaño, fila, columna;
		
		System.out.println("Introduce el tamaño del cuadrado:");
		tamaño = sc.nextInt();
		
		for (fila = 1; fila <= tamaño; fila++) {
			for (columna = 1; columna <= tamaño; columna++) {
				if (fila > 1 && fila < tamaño && columna > 1 && columna < tamaño ) {
					System.out.print(" ");
				}
				else System.out.print("*");
			}
			System.out.println("");

		}
		
	}

}
