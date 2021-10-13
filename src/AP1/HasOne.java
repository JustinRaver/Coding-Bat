package AP1;

/**
 * Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
 * <p>
 * <p>
 * hasOne(10) → true
 * hasOne(22) → false
 * hasOne(220) → false
 */
public class HasOne {
    public boolean hasOne(int n) {
        // String s = String.valueOf(n);
        // return s.contains("1");
        if (n == 1) {
            return true;
        }

        int num = 10;
        while (num <= n) {
            if (n % num == 1) {
                return true;
            }
            n /= 10;

            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}
