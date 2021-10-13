package String1;

/**
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
 * <p>
 * <p>
 * lastChars("last", "chars") → "ls"
 * lastChars("yo", "java") → "ya"
 * lastChars("hi", "") → "h@"
 */
public class LastChars {
    public String lastChars(String a, String b) {
        if (a.length() < 1 && b.length() < 1) {
            return "@@";
        } else if (b.length() < 1) {
            return a.charAt(0) + "@";
        } else if (a.length() < 1) {
            return "@" + b.substring(b.length() - 1);
        } else {
            return a.charAt(0) + b.substring(b.length() - 1);
        }
    }
}
