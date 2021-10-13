package String2;

/**
 * Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
 * <p>
 * <p>
 * xyzMiddle("AAxyzBB") → true
 * xyzMiddle("AxyzBB") → true
 * xyzMiddle("AxyzBBB") → false
 */
public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        if (!str.contains("xyz")) {
            return false;
        }
        if (str.length() == 3 || str.length() == 4) {
            return true;
        }

        return xyzMiddle(str.substring(1, str.length() - 1));
    }
}
