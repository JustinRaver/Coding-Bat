package Warmup1;

/**
 * Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
 * <p>
 * <p>
 * missingChar("kitten", 1) → "ktten"
 * missingChar("kitten", 0) → "itten"
 * missingChar("kitten", 4) → "kittn"
 */
public class MissingChar {
    public String missingChar(String str, int n) {
        StringBuilder newStr = new StringBuilder(str);
        newStr.deleteCharAt(n);
        return newStr.toString();
    }
}
