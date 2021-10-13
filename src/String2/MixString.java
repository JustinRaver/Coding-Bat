package String2;

/**
 * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
 * <p>
 * <p>
 * mixString("abc", "xyz") → "axbycz"
 * mixString("Hi", "There") → "HTihere"
 * mixString("xxxx", "There") → "xTxhxexre"
 */
public class MixString {
    public String mixString(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "";
        }

        String retVal = "";
        if (!a.isEmpty()) {
            retVal += a.charAt(0);
        }
        if (!b.isEmpty()) {
            retVal += b.charAt(0);
        }

        return retVal + mixString(a.isEmpty() ? "" : a.substring(1), b.isEmpty() ? "" : b.substring(1));
    }
}
