import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temperatura, diamax = 1, diamin = 1;
		int min = 0, max = 0;
		int bajoCero = 0;
		int filomena = 0;
		boolean guardar = false;
		
		System.out.println("Introduce las temperaturas medias de cada dia");
		
		for (int i = 1; i<=31;i++) {
			System.out.print(i + " de Enero: "); 
			temperatura = sc.nextInt();
			if (i==1) {
				max = temperatura;
				min = temperatura;
			}
			else {
				if (temperatura < min) {
					min = temperatura;
					diamin = i;
				}
				else {
					if (temperatura > max) {
						max = temperatura;
						diamax = i;
					}
				}
			}
			
			if (temperatura < 0) {
				bajoCero++;
				filomena++;
			}
			else {
				filomena = 0;
			}
			if (filomena >= 5) {
				guardar = true;
			}
		}
		System.out.println("La temperatura mínima es de " + min + "ºC, registrada el " + diamin + " de Enero");
		System.out.println("La temperatura máxima es de " + max + "ºC, registrada el " + diamax + " de Enero");
		System.out.println("La temperatura ha estado bajo cero " + bajoCero + " días");
		if (guardar) System.out.println("Se ha producido una filomena");

		sc.close();

	}

}
