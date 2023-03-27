package java.by.petrovich.math;

public class Math {
    public int sum(int a, int b) {
        return ((long) a + b > Integer.MAX_VALUE) ? -1 : a + b;
    }

}
