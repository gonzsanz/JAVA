
import java.util.Scanner;
public class Variante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int tamaño = 4;
		int fila, columna;
        for(fila = 1; fila <= tamaño; fila++){
            //Espacios en blanco
            for(columna = fila; columna<= tamaño; columna++) {
                System.out.print(" ");
            }
 
            //Asteriscos
            for(columna = 1; columna <= fila ; columna++) {
                System.out.print("*");
            }
            for (columna = 1; columna < fila; columna++) {
            	System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();

	}
}
