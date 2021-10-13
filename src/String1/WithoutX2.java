package String1;

/**
 * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
 * <p>
 * <p>
 * withoutX2("xHi") → "Hi"
 * withoutX2("Hxi") → "Hi"
 * withoutX2("Hi") → "Hi"
 */
public class WithoutX2 {
    public String withoutX2(String str) {
        String tmp = "";
        if (!str.isEmpty()) {
            if (!str.startsWith("x")) {
                tmp += str.substring(0, 1);
            }
            if (str.length() > 1) {
                if (!str.startsWith("x", 1)) {
                    tmp += str.substring(1, 2);
                }
                if (str.length() > 2) {
                    tmp += str.substring(2);
                }
            }
        }
        return tmp;
    }
}
