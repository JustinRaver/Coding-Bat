package String2;

/**
 * Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
 * <p>
 * <p>
 * sameStarChar("xy*yzz") → true
 * sameStarChar("xy*zzz") → false
 * sameStarChar("*xa*az") → true
 */
public class SameStarChar {
    public boolean sameStarChar(String str) {
        if (str.replaceAll("[*]", "").isEmpty()) {
            return true;
        }
        if (str.charAt(0) == '*') {
            str = str.substring(1);
        }
        if (str.charAt(str.length() - 1) == '*') {
            str = str.substring(0, str.length() - 1);
        }
        int index = str.indexOf("*");
        if (index == -1) {
            return true;
        }
        if (str.charAt(index - 1) == str.charAt(index + 1)) {
            return sameStarChar(str.substring(index + 1));
        }

        return false;
    }
}
