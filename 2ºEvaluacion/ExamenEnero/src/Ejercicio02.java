import java.util.Scanner;


public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float par = 0;
        float imp = 0;
        int cont = 0;
        int num;
        System.out.println("Introduce valores o 0 para terminar");

        do {
            num = sc.nextInt();
            if (num != 0) {
                cont++;
                if (num % 2 == 0) {
                    par += num;
                } else
                    imp += num;
            }

        } while (num != 0);

        par = par / cont;
        imp = imp / cont;

        System.out.println("El número total de valores introducidos es: " + cont);
        System.out.println("La media de los valores pares es de: " + par);
        System.out.println("La media de los valores impares es de: " + imp);

        if (par > imp) {
            System.out.println("La media mayor es la de los pares");
        } else if (par > imp) {
            System.out.println("La media mayor es la de los impares");
        }
        if (par == imp)
            System.out.println("Las medias son iguales");

        sc.close();
    }

}
