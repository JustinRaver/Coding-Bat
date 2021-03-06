package String1;

/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 * <p>
 * <p>
 * hasBad("badxx") → true
 * hasBad("xbadxx") → true
 * hasBad("xxbadxx") → false
 */
public class HasBad {
    public boolean hasBad(String str) {
        if (str.length() > 2) {
            if ((str.startsWith("bad"))) {
                return true;
            }
            if (str.length() != 3) {
                return str.startsWith("bad", 1);
            }
        }
        return false;
    }
}
