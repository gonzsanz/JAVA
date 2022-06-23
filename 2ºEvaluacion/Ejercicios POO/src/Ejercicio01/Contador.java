package Ejercicio01;

public class Contador {

    private int cont;

    public Contador() {

        cont = 0;
    }

    public Contador(int num) {

        this.cont = num;
    }

    public int incrementar() {

        return cont++;
    }

    public int decrementar() {

        return cont--;
    }
}
