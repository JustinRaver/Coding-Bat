package Logic1;

/**
 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
 * <p>
 * <p>
 * sumLimit(2, 3) → 5
 * sumLimit(8, 3) → 8
 * sumLimit(8, 1) → 9
 */
public class SumLimit {
    public int sumLimit(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(a + b);

        int aLen = strA.length();
        int sumLen = strB.length();

        if (aLen == sumLen) {
            return a + b;
        }
        return a;
    }
}
