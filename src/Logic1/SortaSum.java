package Logic1;

/**
 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
 * <p>
 * <p>
 * sortaSum(3, 4) → 7
 * sortaSum(9, 4) → 20
 * sortaSum(10, 11) → 21
 */
public class SortaSum {
    public int sortaSum(int a, int b) {
        int res = a + b;
        if (res > 9 && res < 20) {
            return 20;
        }
        return res;
    }
}
