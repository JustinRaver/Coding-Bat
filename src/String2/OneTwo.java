package String2;

/**
 * Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
 * <p>
 * <p>
 * oneTwo("abc") → "bca"
 * oneTwo("tca") → "cat"
 * oneTwo("tcagdo") → "catdog"
 */
public class OneTwo {
    public String oneTwo(String str) {
        if (str.length() < 3) {
            return "";
        }
        return str.substring(1, 3) + str.charAt(0) + ((str.length() > 3) ? oneTwo(str.substring(3)) : "");
    }
}
