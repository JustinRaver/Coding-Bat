package Recursion1;

/**
 * Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
 * <p>
 * <p>
 * strCopies("catcowcat", "cat", 2) → true
 * strCopies("catcowcat", "cow", 2) → false
 * strCopies("catcowcat", "cow", 1) → true
 */
public class StrCopies {
    public boolean strCopies(String str, String sub, int n) {
        if (n == 0) {
            return true;
        }
        if (!str.contains(sub)) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        int i = str.indexOf(sub);
        return strCopies(str.substring(0, i) + str.substring(i + 1), sub, n - 1);
    }
}
