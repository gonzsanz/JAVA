package Ejercicio04;

public class NumerosPescaderia {

    private int numeroClientes;
    private int maxclientes;

    public NumerosPescaderia(int maxclientes) {
        this.maxclientes = maxclientes;

    }

    public void cogerNumero() throws Exception {

        numeroClientes++;
        if (numeroClientes > maxclientes) {
            throw new Exception("EstoySaturadoException");
        }
    }

    public void dejarNumero() {

        numeroClientes--;
    }

}
