package Recursion1;

/**
 * Given a string, compute recursively a new string where all the 'x' chars have been removed.
 * <p>
 * <p>
 * noX("xaxb") → "ab"
 * noX("abc") → "abc"
 * noX("xx") → ""
 */
public class NoX {
    public String noX(String str) {
        int index = str.indexOf("x");
        if (index == -1) {
            return str;
        }
        if (index == 0) {
            return noX(str.substring(1));
        }
        return str.substring(0, index) + noX(str.substring(index + 1));
    }
}
