import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner coordenada = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.print("Introduce las coordenadas del eje x: ");
		x = coordenada.nextInt();
		System.out.print("Introduce las coordenadas del eje y: ");
		y = coordenada.nextInt();
		
		if (x > 0 && y > 0) System.out.println("Noreste");
		if (x < 0 && y > 0) System.out.println("Suroeste");
		if (x > 0 && y < 0) System.out.println("Sureste");
		if (x < 0 && y < 0) System.out.println("Suroeste");
		if (x == 0 && y > 0) System.out.println("Norte");
		if (x == 0 && y < 0) System.out.println("Sur");
		if (x > 0 && y == 0) System.out.println("Este");
		if (x < 0 && y == 0) System.out.println("Oeste");

		coordenada.close();
	}

}
