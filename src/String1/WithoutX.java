package String1;

/**
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
 * <p>
 * <p>
 * withoutX("xHix") → "Hi"
 * withoutX("xHi") → "Hi"
 * withoutX("Hxix") → "Hxi"
 */
public class WithoutX {
    public String withoutX(String str) {
        String tmp = "";
        if (!str.isEmpty()) {
            if (str.length() > 1) {
                if (str.charAt(0) == 'x') {
                    tmp += str.substring(1, str.length() - 1);
                } else {
                    tmp += str.substring(0, str.length() - 1);
                }
            }
            if (!str.endsWith("x")) {
                tmp += str.substring(str.length() - 1);
            }
        }
        return tmp;
    }
}
