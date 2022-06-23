public class Cuenta implements Comparable<Cuenta> {

    long numcuenta;
    String nombrecliente;
    float saldo;

    Cuenta(long numcuenta, String nombre, float saldo) {
        this.numcuenta = numcuenta;
        this.nombrecliente = nombre;
        this.saldo = saldo;
    }

    public String toString() {
        return String.format(" %10d,%10s, Saldo actual = %10.2f ", numcuenta, nombrecliente, saldo);
    }

    @Override
    public int compareTo(Cuenta c) {
        return (int) (this.saldo - c.saldo);
    }
}