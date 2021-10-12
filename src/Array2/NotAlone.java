package Array2;

public class NotAlone {
    /**
     * We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
     * <p>
     * <p>
     * notAlone([1, 2, 3], 2) → [1, 3, 3]
     * notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
     * notAlone([3, 4], 3) → [3, 4]
     *
     * @param nums
     * @param val
     * @return
     */
    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val) {
                nums[i] = alone(nums, i);
            }
        }
        return nums;
    }

    public int alone(int[] nums, int idx) {
        if (nums[idx - 1] == nums[idx] || nums[idx + 1] == nums[idx]) {
            return nums[idx];
        }
        if (nums[idx - 1] > nums[idx + 1]) {
            return nums[idx - 1];
        }
        return nums[idx + 1];
    }
}
