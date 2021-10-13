package Logic2;

/**
 * Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
 * <p>
 * <p>
 * evenlySpaced(2, 4, 6) → true
 * evenlySpaced(4, 6, 2) → true
 * evenlySpaced(4, 6, 3) → false
 */
public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {

        if (a > b && a > c) {
            return diff(a, b) == diff(b, c) || diff(c, b) == diff(a, c);
        } else if (b > a && b > c) {
            return diff(b, c) == diff(c, a) || diff(a, b) == diff(a, c);
        } else if (c > b && c > a) {
            return diff(c, b) == diff(b, a) || diff(a, b) == diff(a, c);
        }
        return false || (a == b && b == c);
    }

    public int diff(int a, int b) {
        return Math.abs(a - b);
    }
}
