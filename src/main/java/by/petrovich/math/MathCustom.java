package by.petrovich.math;

public class MathCustom {
    public int sum(int a, int b) {
        return ((long) a + b > Integer.MAX_VALUE) ? -1 : a + b;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public double avg(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return Math.round(sum / array.length);
    }
}
