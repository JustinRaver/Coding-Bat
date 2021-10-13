package Warmup2;

/**
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 * <p>
 * <p>
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */
public class DoubleX {
    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                return str.charAt(i + 1) == 'x';
            }
        }
        return false;
    }
}
