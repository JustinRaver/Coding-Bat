package Array2;

public class Has12 {
    /**
     * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
     * <p>
     * <p>
     * has12([1, 3, 2]) → true
     * has12([3, 1, 2]) → true
     * has12([3, 1, 4, 5, 2]) → true
     *
     * @param nums
     * @return
     */
    public boolean has12(int[] nums) {
        int i = 0;
        int target = 1;

        while (i < nums.length) {
            if (nums[i] == target) {
                if (target == 1) {
                    target = 2;
                } else {
                    target = 100;
                }
            }
            i++;
        }
        return target == 100;
    }
}
