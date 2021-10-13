package String1;

/**
 * Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
 * <p>
 * <p>
 * deFront("Hello") → "llo"
 * deFront("java") → "va"
 * deFront("away") → "aay"
 */
public class DeFront {
    public String deFront(String str) {
        if (str.isEmpty()) {
            return str;
        }
        String tmp = "";
        if (str.length() == 1) {
            if (str.equals("a")) {
                tmp += str;
            }
            return "";
        }
        if (str.charAt(0) == 'a') {
            tmp += str.substring(0, 1);
        }
        if (str.charAt(1) == 'b') {
            tmp += str.substring(1, 2);
        }
        if (str.length() > 2) {
            tmp += str.substring(2);
        }
        return tmp;
    }
}
