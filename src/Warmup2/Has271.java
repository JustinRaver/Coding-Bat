package Warmup2;

/**
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
 * <p>
 * <p>
 * has271([1, 2, 7, 1]) → true
 * has271([1, 2, 8, 1]) → false
 * has271([2, 7, 1]) → true
 */
public class Has271 {
    public boolean has271(int[] nums) {
        int num = 2;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length > i + 2) {
                if (nums[i + 1] == nums[i] + 5) {
                    if (nums[i + 2] < nums[i] + 2 && nums[i + 2] > nums[i] - 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
