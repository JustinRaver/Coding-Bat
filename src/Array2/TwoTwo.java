package Array2;

public class TwoTwo {
    /**
     * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
     * <p>
     * <p>
     * twoTwo([4, 2, 2, 3]) → true
     * twoTwo([2, 2, 4]) → true
     * twoTwo([2, 2, 4, 2]) → false
     *
     * @param nums
     * @return
     */
    public boolean twoTwo(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] == 2) {
                return false;
            }
        }

        boolean retVal = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                retVal = twos(nums, i);
                if (!retVal) {
                    return false;
                }
            }
        }
        return retVal;
    }

    public boolean twos(int[] nums, int idx) {
        if (idx == 0) {
            return nums[idx + 1] == 2;
        } else if (idx == nums.length - 1) {
            return nums[idx - 1] == 2;
        } else return nums[idx - 1] == 2 || nums[idx + 1] == 2;
    }
}
