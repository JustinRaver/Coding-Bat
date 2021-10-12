package Array2;

public class TenRun {
    /**
     * For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
     * <p>
     * <p>
     * tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
     * tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
     * tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
     *
     * @param nums
     * @return
     */
    public int[] tenRun(int[] nums) {
        int multiple = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                multiple = nums[i];
            } else {
                if (multiple != Integer.MIN_VALUE) {
                    nums[i] = multiple;
                }
            }
        }
        return nums;
    }
}
