
public class Ejercicio01 {

    // Ejercicio 1 A: Cambia todas las vocales por el carácter dígito
    // correspondiente ( ‘a’ → 1, ‘e’ → 2, ‘i’ → ‘3’….). Suponer
    // que solo existen vocales en minúscula y si acento.

    static String cambiarVocalesPorNumeros(String mensaje) {

        String str = "";

        str = mensaje.replace('a', '1').replace('e', '2').replace('i', '3').replace('o', '4').replace('u', '5');

        return str;
    }

    // Ejercicio1B: Devuelve la longitud de la secuencia más larga de números
    // ordenados en orden creciente

    static int secuenciaMasLarga(int numeros[]) {

        int cont = 0;
        int aux = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            
            if (numeros[i] <= numeros[i + 1]) {
                cont++;
            } else {
                aux = cont;
                cont = 0;
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        String mensaje = "Hola pepe Luis";
        System.out.println(cambiarVocalesPorNumeros(mensaje));

        int[] numeros = { 6, 1, 2, 3, 4, 0, 1, 5, 1, 2, 2, 2, 7, 9, 2, 3 };
        int[] numeros2 = { 1, 1, 2, 3, 6, 0, 1, 5, 1, 2, 7, 1, 3, 4, 2, 3, 3, 1 };

        System.out.println(secuenciaMasLarga(numeros));
        System.out.println(secuenciaMasLarga(numeros2));
    }
}
