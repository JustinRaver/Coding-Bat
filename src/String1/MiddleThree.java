package String1;

/**
 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
 * <p>
 * <p>
 * middleThree("Candy") → "and"
 * middleThree("and") → "and"
 * middleThree("solving") → "lvi"
 */
public class MiddleThree {
    public String middleThree(String str) {
        if (str.length() == 3) {
            return str;
        }
        int len = (str.length() - 3) / 2;
        return str.substring(len, len + 3);
    }
}
