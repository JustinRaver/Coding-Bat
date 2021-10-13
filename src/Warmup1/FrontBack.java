package Warmup1;

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 * <p>
 * <p>
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */
public class FrontBack {
    public String frontBack(String str) {
        String newString = "";
        if (str.length() > 1) {
            newString += str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
            return newString;
        }
        return str;
    }
}
