package javase01.t04;

/**
 * Задание 4. Одномерные массивы
 */

public class Array {
    public static double findMaxSumm(double[] array) {
        assert (array.length % 2 == 0);

        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length / 2; i++) {
            double summ = array[i] + array[array.length - 1 - i];
            if (summ > max) max = summ;
        }
        return max;
    }
}
