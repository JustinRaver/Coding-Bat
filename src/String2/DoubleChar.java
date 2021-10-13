package String2;

/**
 * Given a string, return a string where for every char in the original, there are two chars.
 * <p>
 * <p>
 * doubleChar("The") → "TThhee"
 * doubleChar("AAbb") → "AAAAbbbb"
 * doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class DoubleChar {
    public String doubleChar(String str) {
        StringBuilder s = new StringBuilder();
        for (Character c : str.toCharArray()) {
            s.append(c).append(c);
        }
        return s.toString();
    }
}
