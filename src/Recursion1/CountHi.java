package Recursion1;

/**
 * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
 * <p>
 * <p>
 * countHi("xxhixx") → 1
 * countHi("xhixhix") → 2
 * countHi("hi") → 1
 */
public class CountHi {
    public int countHi(String str) {
        if (str.contains("hi")) {
            return 1 + countHi(str.substring(str.indexOf("hi") + 1));
        }
        return 0;
    }
}
