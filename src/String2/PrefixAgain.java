package String2;

/**
 * Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
 * <p>
 * <p>
 * prefixAgain("abXYabc", 1) → true
 * prefixAgain("abXYabc", 2) → true
 * prefixAgain("abXYabc", 3) → false
 */
public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        String leftover = str.substring(n);
        return leftover.contains(prefix);
    }
}
