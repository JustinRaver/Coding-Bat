package String1;

/**
 * Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
 * <p>
 * <p>
 * conCat("abc", "cat") → "abcat"
 * conCat("dog", "cat") → "dogcat"
 * conCat("abc", "") → "abc"
 */
public class ConCat {
    public String conCat(String a, String b) {
        if (!a.isEmpty() && !b.isEmpty()) {
            if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
                return a.substring(0, a.length() - 1) + b;
            }
        }
        return a + b;
    }
}
