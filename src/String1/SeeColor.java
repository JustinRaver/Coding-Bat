package String1;

/**
 * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
 * <p>
 * <p>
 * seeColor("redxx") → "red"
 * seeColor("xxred") → ""
 * seeColor("blueTimes") → "blue"
 */
public class SeeColor {
    public String seeColor(String str) {
        if (str.length() > 2) {
            if (str.startsWith("red")) {
                return str.substring(0, 3);
            }
            if (str.length() > 3) {
                if (str.startsWith("blue")) {
                    return str.substring(0, 4);
                }
            }
        }
        return "";
    }
}
