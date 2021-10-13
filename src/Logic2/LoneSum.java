package Logic2;

/**
 * Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
 * <p>
 * <p>
 * loneSum(1, 2, 3) → 6
 * loneSum(3, 2, 3) → 2
 * loneSum(3, 3, 3) → 0
 */
public class LoneSum {
    public int loneSum(int a, int b, int c) {

        if (a == b && b == c) {
            return 0;
        }
        int common = 0;
        if (a == b) {
            common = c;
        } else if (a == c) {
            common = b;

        } else if (b == c) {
            common = a;
        } else {
            return a + b + c;
        }
        return common;
    }
}
