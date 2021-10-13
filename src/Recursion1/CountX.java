package Recursion1;

/**
 * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 * <p>
 * <p>
 * countX("xxhixx") → 4
 * countX("xhixhix") → 3
 * countX("hi") → 0
 */
public class CountX {
    public int countX(String str) {
        if (str.length() > 0) {
            if (str.startsWith("x")) {
                return 1 + countX(str.substring(1));
            }
            return countX(str.substring(1));
        }
        return 0;
    }
}
