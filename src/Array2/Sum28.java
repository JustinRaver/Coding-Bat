package Array2;

public class Sum28 {
    /**
     * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
     * <p>
     * <p>
     * sum28([2, 3, 2, 2, 4, 2]) → true
     * sum28([2, 3, 2, 2, 4, 2, 2]) → false
     * sum28([1, 2, 3, 4]) → false
     *
     * @param nums
     * @return
     */
    public boolean sum28(int[] nums) {
        int sum = 0;

        for (int i : nums) {
            if (i == 2) {
                sum += 2;
            }
        }
        return sum == 8;
    }
}