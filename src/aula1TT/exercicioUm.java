package aula1TT;

import java.util.Arrays;
import java.util.Collections;

public class exercicioUm {
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};

        // ordenação crescente
        Arrays.sort(array);

        for (int arr: array) {
            System.out.println(arr);
        }

        // ordenacao decrescente
        Arrays.sort(array, Collections.reverseOrder());

        for (int arr: array) {
            System.out.println(arr);
        }
    }
}
