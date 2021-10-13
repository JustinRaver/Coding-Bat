package String2;

/**
 * Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 * <p>
 * <p>
 * starOut("ab*cd") → "ad"
 * starOut("ab**cd") → "ad"
 * starOut("sm*eilly") → "silly"
 */
public class StarOut {
    public String starOut(String str) {
        if (str.replaceAll("\\s+", "").replaceAll(" ", "").isEmpty()) {
            return "";
        }

        char[] a = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {

            } else if (i == str.length() - 1) {

            } else {

            }
        }
        return "";
    }
}
