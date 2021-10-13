package Recursion1;

/**
 * Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.
 * <p>
 * <p>
 * count11("11abc11") → 2
 * count11("abc11x11x11") → 3
 * count11("111") → 1
 */
public class Count11 {
    public int count11(String str) {
        if (!str.contains("11")) {
            return 0;
        }
        return count11(str.replaceFirst("11", "")) + 1;
    }
}
