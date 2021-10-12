package Array1;

public class Double23 {
    /**
     * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
     * <p>
     * <p>
     * double23([2, 2]) → true
     * double23([3, 3]) → true
     * double23([2, 3]) → false
     *
     * @param nums
     * @return
     */
    public boolean double23(int[] nums) {
        int twoCount = 0;
        int threeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                twoCount++;
            } else if (nums[i] == 3) {
                threeCount++;
            }
        }
        return twoCount > 1 || threeCount > 1;
    }
}
