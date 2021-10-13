package Warmup2;

/**
 * Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
 * <p>
 * <p>
 * array667([6, 6, 2]) → 1
 * array667([6, 6, 2, 6]) → 1
 * array667([6, 7, 2, 6]) → 1
 */
public class Array667 {
    public int array667(int[] nums) {
        int sixCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                sixCount++;
            } else if (sixCount > 0 && nums[i] == 7) {
                sixCount++;
            } else {
                sixCount = 0;
            }
            if (sixCount > 1) {
                count++;
                if (nums[i] != 6) {
                    sixCount = 0;
                }
            }
        }
        return count;
    }
}
