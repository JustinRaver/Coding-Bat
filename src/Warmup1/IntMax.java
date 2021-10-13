package Warmup1;

/**
 * Given three int values, a b c, return the largest.
 * <p>
 * <p>
 * intMax(1, 2, 3) → 3
 * intMax(1, 3, 2) → 3
 * intMax(3, 2, 1) → 3
 */
public class IntMax {
    public int intMax(int a, int b, int c) {
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        return largest;
    }
}
