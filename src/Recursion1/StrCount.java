package Recursion1;

/**
 * Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
 * <p>
 * <p>
 * strCount("catcowcat", "cat") → 2
 * strCount("catcowcat", "cow") → 1
 * strCount("catcowcat", "dog") → 0
 */
public class StrCount {
    public int strCount(String str, String sub) {
        if (!str.contains(sub)) {
            return 0;
        }
        return strCount(str.replaceFirst(sub, ""), sub) + 1;
    }
}
