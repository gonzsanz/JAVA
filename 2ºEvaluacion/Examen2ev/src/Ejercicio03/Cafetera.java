package Ejercicio03;

public class Cafetera {

    protected int capacidadMaxima;
    protected int cantidadActual;

    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public Cafetera(int max) {

        capacidadMaxima = max;
        cantidadActual = 0;
    }

    public Cafetera(int max, int actual) {

        capacidadMaxima = max;
        cantidadActual = actual;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
    }

    public void llenarCafetera() {

        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int cantidad) {
        
        cantidadActual -= cantidad;
        if (cantidadActual < cantidad) {
            cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {

        cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {

        cantidadActual += cantidad;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
    }
    
}
