package Warmup2;

/**
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 * <p>
 * <p>
 * array123([1, 1, 2, 3, 1]) → true
 * array123([1, 1, 2, 4, 1]) → false
 * array123([1, 1, 2, 1, 2, 3]) → true
 */
public class Array123 {
    public boolean array123(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == count) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else if (nums[i] == 1) {
                count = 2;
            } else {
                count = 1;
            }
        }
        return false;
    }
}
