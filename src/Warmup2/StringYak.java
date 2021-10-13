package Warmup2;

/**
 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
 * <p>
 * <p>
 * stringYak("yakpak") → "pak"
 * stringYak("pakyak") → "pak"
 * stringYak("yak123ya") → "123ya"
 */
public class StringYak {
    public String stringYak(String str) {
        StringBuilder temp = new StringBuilder(str);
        int delCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y') {
                if (i + 3 <= str.length()) {
                    if (str.charAt(i + 2) == 'k') {
                        temp.delete(i - (3 * delCount), i + 3 - (3 * delCount));
                        delCount++;
                    }
                }
            }
        }
        return temp.toString();
    }
}
