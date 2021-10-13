package Warmup1;

/**
 * Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
 * <p>
 * <p>
 * notString("candy") → "not candy"
 * notString("x") → "not x"
 * notString("not bad") → "not bad"
 */
public class NotString {
    public String notString(String str) {
        if (str.length() > 2) {
            if (str.startsWith("not")) {
                return str;
            }
        }
        return "not " + str;
    }
}