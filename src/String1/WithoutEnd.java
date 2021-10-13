package String1;

/**
 * Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
 * <p>
 * <p>
 * withoutEnd("Hello") → "ell"
 * withoutEnd("java") → "av"
 * withoutEnd("coding") → "odin"
 */
public class WithoutEnd {
    public String withoutEnd(String str) {
        StringBuilder temp = new StringBuilder(str);

        temp.deleteCharAt(0);
        temp.deleteCharAt(str.length() - 2);
        return temp.toString();
    }
}
