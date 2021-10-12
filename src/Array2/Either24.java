package Array2;

public class Either24 {
    /**
     * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
     * <p>
     * <p>
     * either24([1, 2, 2]) → true
     * either24([4, 4, 1]) → true
     * either24([4, 4, 1, 2, 2]) → false
     *
     * @param nums
     * @return
     */
    public boolean either24(int[] nums) {
        boolean found2 = false;
        boolean found4 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] == 4) {
                found4 = true;
            }
            if (nums[i] == 2 && nums[i + 1] == 2) {
                found2 = true;
            }
        }
        return found2 ^ found4;
    }
}
