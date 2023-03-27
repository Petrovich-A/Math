package by.petrovich.math;

import java.text.DecimalFormat;

public class MathCustom {
    public int sum(int a, int b) {
        return ((long) a + b > Integer.MAX_VALUE) ? -1 : a + b;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public double avg(int[] array) {
        double sum = 0;
        if (array != null && array.length > 0) {
            for (int i : array) {
                sum += i;
            }
            return Math.round((sum / array.length) * 100.0) / 100.0;
        }
        return 0;
    }

}
