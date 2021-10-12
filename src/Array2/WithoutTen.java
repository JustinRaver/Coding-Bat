package Array2;

public class WithoutTen {
    /**
     * Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
     * <p>
     * <p>
     * withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
     * withoutTen([10, 2, 10]) → [2, 0, 0]
     * withoutTen([1, 99, 10]) → [1, 99, 0]
     *
     * @param nums
     * @return
     */
    public int[] withoutTen(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 10) {
                swap(nums, i);
            }
        }
        return nums;
    }

    public void swap(int[] nums, int idx1) {
        for (int i = idx1; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
            nums[i + 1] = 0;
        }
        if (idx1 == nums.length - 1) {
            nums[idx1] = 0;
        }
    }
}
