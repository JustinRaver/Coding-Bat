package Warmup1;

/**
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 * <p>
 * <p>
 * in1020(12, 99) → true
 * in1020(21, 12) → true
 * in1020(8, 99) → false
 */
public class In1020 {
    public boolean in1020(int a, int b) {
        return ((a < 21 && a > 9) || (b < 21 && b > 9));
    }
}
