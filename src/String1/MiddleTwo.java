package String1;

/**
 * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
 * <p>
 * <p>
 * middleTwo("string") → "ri"
 * middleTwo("code") → "od"
 * middleTwo("Practice") → "ct"
 */
public class MiddleTwo {
    public String middleTwo(String str) {
        int num = (str.length() - 2) / 2;
        return str.substring(num, str.length() - num);
    }
}
