package Ejercicio01;

public class PilaEnteros {
    protected int contador;
    protected int[] pila;

    PilaEnteros(int tamaño) {
        contador = 0;
        pila = new int[tamaño];
    }

    // Introduce un entero en la lista. Devuelve verdadero si cabe o falso si la
    // tabla está llena
    public boolean push(int valor) {

        if (!estaLleno()) {
            pila[contador] = valor;
            contador++;
            return true;
        }
        return false;

    }

    // Extrae un entero (el último que se ha introducido) de la lista y lo devuelve
    // de la lista, si no hay ningún número devuelve -1;
    public int pop() {

        int resu;
        if (!estaVacio()) {
            contador--;
            resu = pila[contador];
        } else {
            resu = -1;
        }
        return resu;

    }

    // Devuelve el último entero introducido pero sin eliminarlo o -1 si no hay
    // ningún número almacenado.
    public int peek() {
        int resu;
        if (!estaVacio()) {
            resu = pila[contador - 1];
        } else {
            resu = -1;
        }
        return resu;
    }

    // Devuelve verdadero si la capacidad array está completo.
    public boolean estaLleno() {

        return (contador == pila.length);
    }

    // Devuelve verdadero si la pila está vacía.
    public boolean estaVacio() {
        return (contador == 0);

    }
}
