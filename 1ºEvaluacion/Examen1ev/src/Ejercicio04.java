import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int fila, columna;
		System.out.print("Introduce un número entre 1 y 10: ");
		num =sc.nextInt();
		
		for (fila = 1; fila <= num; fila++) {
			for (columna = 1; columna <= num; columna++) {
				System.out.print(columna);
				if(columna < num) System.out.print("-");
			}
			System.out.println("");
		}
	}

}
