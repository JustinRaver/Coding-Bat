package Warmup1;

/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
 * <p>
 * <p>
 * loneTeen(13, 99) → true
 * loneTeen(21, 19) → true
 * loneTeen(13, 13) → false
 */
public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        if ((a < 20 && a > 12) && !(b < 20 && b > 12)) {
            return true;
        } else return !(a < 20 && a > 12) && (b < 20 && b > 12);
    }
}
