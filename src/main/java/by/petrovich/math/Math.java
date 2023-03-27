package by.petrovich.math;

import java.util.InputMismatchException;

public class Math {
    public int sum(int a, int b) {
        return ((long) a + b > Integer.MAX_VALUE) ? -1 : a + b;
    }

    public int max(int a, int b) {
       return a > b ? a : b;
    }
}
