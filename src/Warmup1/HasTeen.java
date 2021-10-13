package Warmup1;

/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
 * <p>
 * <p>
 * hasTeen(13, 20, 10) → true
 * hasTeen(20, 19, 10) → true
 * hasTeen(20, 10, 13) → true
 */
public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        return ((a < 20 && a > 12) || (b < 20 && b > 12) || (c < 20 && c > 12));
    }
}
