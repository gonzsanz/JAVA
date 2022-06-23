
public class Ejercicio02 {

	public static void main(String[] args) {

		int edificio[][] = {
				{ 10, 4, 3, 8, 5 }, // 1º Planta
				{ 15, 23 }, 
				{ 90 }, 
				{ 9, 34, 15, 1 }, 
				{ 6, 45, 12, 3 }, 
				{ 1, 34, 1, 4 }, 
				{ 4, 4, 124 },
				{ 9, 14, 10, 4 }, 
				{ 9, 4, 10, 6 }, 
				{ 9, 34, 10, 4, 7, 4, 2 } // 10º Planta
		};
				
		int oficina = calcularOficinas(edificio);
		int consumo = calcularConsumo(edificio);
		int max = edificio[0][0];
		int min = edificio[0][0];
		max = calcularMaximo(edificio,max);
		min = calcularMinimo(edificio,min);
		
		System.out.println("El número de oficinas es de " + oficina);
		System.out.println("El consumo total del edificio es de " + consumo);
		System.out.println("La oficina que mas consume está en la planta " + max);
		System.out.println("La oficina que menos consume está en la planta " + min);
		
	}
	
	//Calcula el numero de oficinas que hay
	static int calcularOficinas (int t[][]) {
		
		int ofi = 0;
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[i].length; j++) {
				ofi++;
			}
		}
		
		return ofi;
	}
	
	//Calcula el consumo total
	static int calcularConsumo (int t[][]) {
		int consumo = 0;
		
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[i].length; j++) {
				consumo +=t[i][j];
			}
		}
		return consumo;
	}
	
	//Calcula el maximo consumo
	static int calcularMaximo (int t[][], int max) {
		int plantaMax = 0;
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[i].length; j++) {
				if (t[i][j] > max) {
					max = t[i][j];
					plantaMax = i+1;
				}
			}
		}
		return plantaMax;	
	}
	
	//Calcula el minimo consumo
		static int calcularMinimo (int t[][], int min) {
			int plantaMin = 0;
			for (int i=0; i<t.length; i++) {
				for (int j=0; j<t[i].length; j++) {
					if (t[i][j] < min) {
						min = t[i][j];
						plantaMin = i+1;
					}
				}
			}
			return plantaMin;	
		}
}
