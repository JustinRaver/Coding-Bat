package Warmup2;

/**
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
 * <p>
 * <p>
 * arrayFront9([1, 2, 9, 3, 4]) → true
 * arrayFront9([1, 2, 3, 4, 9]) → false
 * arrayFront9([1, 2, 3, 4, 5]) → false
 */
public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length && i < 4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
}
