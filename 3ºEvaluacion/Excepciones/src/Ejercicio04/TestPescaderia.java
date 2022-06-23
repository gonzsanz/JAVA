package Ejercicio04;

public class TestPescaderia {

    public static void main(String[] args) throws Exception {

        NumerosPescaderia pescaderia = new NumerosPescaderia(10);

        for (int i = 0; i < 10; i++) {
            pescaderia.cogerNumero();

        }
        pescaderia.dejarNumero();
        pescaderia.dejarNumero();

        pescaderia.cogerNumero();
        pescaderia.cogerNumero();
        pescaderia.cogerNumero();

    }
}
