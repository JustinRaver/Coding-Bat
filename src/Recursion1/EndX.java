package Recursion1;

/**
 * Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
 * <p>
 * <p>
 * endX("xxre") → "rexx"
 * endX("xxhixx") → "hixxxx"
 * endX("xhixhix") → "hihixxx"
 */
public class EndX {
    public String endX(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + "x";
        }
        return str.charAt(0) + endX(str.substring(1));
    }
}
