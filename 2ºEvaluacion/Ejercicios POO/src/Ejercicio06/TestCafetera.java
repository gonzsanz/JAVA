package Ejercicio06;


public class TestCafetera {
    
    public static void main(String[] args) {
        
        Cafetera cafetera = new Cafetera(3000,245);
        System.out.println("Cantidad actual de la cafetera: " + cafetera.cantidadActual);

        cafetera.llenarCafetera();
        System.out.println("Cantidad actual de la cafetera: " + cafetera.cantidadActual);

        cafetera.llenarTaza(200);
        System.out.println("Cantidad actual de la cafetera: " + cafetera.cantidadActual);

        cafetera.llenarTaza(300);
        System.out.println("Cantidad actual de la cafetera: " + cafetera.cantidadActual);

        cafetera.vaciarCafetera();
        System.out.println("Cantidad actual de la cafetera: " + cafetera.cantidadActual);

        cafetera.agregarCafe(2000);
        System.out.println("Cantidad actual de la cafetera: " + cafetera.cantidadActual);


    }
}
