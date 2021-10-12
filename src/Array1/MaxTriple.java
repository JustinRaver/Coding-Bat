package Array1;

public class MaxTriple {
    /**
     * Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
     * <p>
     * <p>
     * maxTriple([1, 2, 3]) → 3
     * maxTriple([1, 5, 3]) → 5
     * maxTriple([5, 2, 3]) → 5
     *
     * @param nums
     * @return
     */
    public int maxTriple(int[] nums) {
        int al = nums.length;
        if (al == 1) {
            return nums[0];
        }
        int big = 0;
        if (nums[0] > big) {
            big = nums[0];
        }
        if (nums[(al - 1) / 2] > big) {
            big = nums[(al - 1) / 2];
        }
        if (nums[al - 1] > big) {
            big = nums[al - 1];
        }
        return big;
    }
}
