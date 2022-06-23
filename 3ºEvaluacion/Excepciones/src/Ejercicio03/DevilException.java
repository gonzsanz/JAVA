package Ejercicio03;

import java.util.Random;
import java.time.*;

public class DevilException {

    public static void main(String[] args) throws Exception {
        Random rd = new Random();

        int num;
        int cont = 0;

        Instant instantStart = Instant.now();
        do {

            num = rd.nextInt(90) + 1;
            System.out.print(num + " ");
            if (num == 6) {
                cont++;
            } else {
                cont = 0;
            }
        } while (cont < 3);
        Instant instantStop = Instant.now();
        Duration durationbetween = Duration.between(instantStart, instantStop);
        System.out.println("\nTiempo en ocurrir: " + durationbetween.toSeconds() + " segundos");

        throw new Exception("DevilException");
    }
}
