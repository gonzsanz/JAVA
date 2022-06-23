//El cálculo se realizara un incrementado un 20% si el vuelo se realiza en fin de semana y 15% si es en viernes al la tarifa básica. 
//Si el billete es Business se incrementará con un plus de 200 Euros. Se supone que no se van ha introducir datos incorrectos.
import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double tarifa;
		char dia;
		char billete;
		
		System.out.println("CALCULADORA DE PRECIOS");
		System.out.print("Tarifa: ");
		tarifa = sc.nextDouble();
		System.out.print("Día de la semana LMXJVSD: ");
		dia = sc.next().charAt(0);
		System.out.print("Tipo de billete N/B: ");
		billete = sc.next().charAt(0);

		if (dia == 'V' || dia == 'v') {
			tarifa = (tarifa * 0.15) + tarifa;
		}
		if (dia == 'S' || dia == 's'|| dia == 'D' || dia == 'd') {
			tarifa = (tarifa * 0.20) + tarifa;
		}
		if (billete == 'B' || billete == 'b') {
			tarifa +=200;
		}
		System.out.print("El precio final del vuelo es de: " + tarifa + " Euros");
	
		sc.close();
	}

}
