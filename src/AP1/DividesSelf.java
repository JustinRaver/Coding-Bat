package AP1;

/**
 * We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
 * <p>
 * <p>
 * dividesSelf(128) → true
 * dividesSelf(12) → true
 * dividesSelf(120) → false
 */
public class DividesSelf {
    public boolean dividesSelf(int n) {
        int num = n;

        while (num > 0) {
            int rightMost = num % 10;

            if (rightMost == 0) {
                return false;
            }

            if (n % rightMost != 0) {
                return false;
            }
            if (num > 10) {
                num /= 10;
            } else {
                num = 0;
            }
        }
        return true;
    }
}
