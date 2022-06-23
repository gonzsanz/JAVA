package Ejercicio03;

public class Espectador {

    private String nombre;
    private int edad;
    private float dinero;

    public Espectador(String nombre, int edad, float dinero) {

        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getDinero() {
        return dinero;
    }

    public float setDinero(float dinero) {
        this.dinero = dinero;
        return dinero;
    }
}
