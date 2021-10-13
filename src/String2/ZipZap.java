package String2;

/**
 * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
 * <p>
 * <p>
 * zipZap("zipXzap") → "zpXzp"
 * zipZap("zopzop") → "zpzp"
 * zipZap("zzzopzop") → "zzzpzp"
 */
public class ZipZap {
    public String zipZap(String str) {
        if (str.length() < 3) {
            return str;
        }
        char[] c = str.toCharArray();

        for (int i = 0; i < str.length() - 1; i++) {
            if (c[i] == 'z' && c[i + 2] == 'p') {
                c[i + 1] = ' ';
            }
        }
        String string = new String(c);
        return string.replaceAll(" ", "");

    }
}
