package by.petrovich.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathCustom {
    private final static int DECIMAL_PLACES = 2;

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
            return round(sum / array.length);
        }
        return 0;
    }

    public int maxNumber(int[] array) {
        int maxNumber = 0;
        if (array!=null && array.length > 0) {
            maxNumber = array[0];
            for (int i = 1; i < array.length; i++) {
                if (maxNumber <= array[i]) {
                    maxNumber = array[i];
                }
            }
        }
        return maxNumber;
    }

    private static double round(double value) {
        if (DECIMAL_PLACES < 0) throw new IllegalArgumentException();
        BigDecimal bigDecimal = BigDecimal.valueOf(value);
        bigDecimal = bigDecimal.setScale(DECIMAL_PLACES, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

}
