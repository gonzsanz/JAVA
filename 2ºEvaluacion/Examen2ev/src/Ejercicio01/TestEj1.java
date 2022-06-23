package Ejercicio01;

public class TestEj1{

    public static void main(String[] args) {
        
        System.out.println(Ej1A.quitarVocales("Hola Pepe"));

        System.out.println((Ej1C.superEco("hola", 4)));

        int ta[] = {2,3,5};
        int tb[] = { 3, 5,7,8,2,0};
        int tc[] = { 2,3,5};
        int td[] = {3,-3,8,10};
        System.out.println(Ej1D.estaIncluido(ta,tb));
        System.out.println(Ej1D.estaIncluido(tc,td));

    }
}





