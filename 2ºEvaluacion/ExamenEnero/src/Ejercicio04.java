public class Ejercicio04 {
	
	public static void main(String[] args) {
		int tabla[][] = new int [10][5];
		int suma = 0;
		
		System.out.println("   TABLA");
		for (int fila=0; fila<tabla.length; fila++) {
			for (int columna=0; columna<tabla[fila].length; columna++) {
				tabla[fila][columna] = (int) (Math.random()*20);
				System.out.print(tabla[fila][columna] + " ");
			}
			System.out.println("");
		}
		
		for (int i=0; i<tabla.length; i++) {
			for (int j=0; j<tabla[i].length; j++) {
				if (i==0 && j==0) {
					suma +=tabla[i][j];
				}
				if (i==0 && j==tabla[i].length-1) {
					suma +=tabla[i][j];
				}
				if (i==tabla.length-1 && j==0) {
					suma +=tabla[i][j];
				}
				if (i==tabla.length-1 && j==tabla[i].length-1) {
					suma +=tabla[i][j];
				}
			}
		}
		System.out.println("\nLa suma es " + suma);
		
	}
	
}
