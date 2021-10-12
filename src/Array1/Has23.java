package Array1;

public class Has23 {
    /**
     * Given an int array length 2, return true if it contains a 2 or a 3.
     * <p>
     * <p>
     * has23([2, 5]) → true
     * has23([4, 3]) → true
     * has23([4, 5]) → false
     *
     * @param nums
     * @return
     */
    public boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
