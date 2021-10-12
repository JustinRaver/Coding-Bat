package Array2;

public class ZeroFront {
    /**
     * Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
     * <p>
     * <p>
     * zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
     * zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
     * zeroFront([1, 0]) → [0, 1]
     *
     * @param nums
     * @return
     */
    public int[] zeroFront(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(nums, i);
            }
        }
        return nums;
    }

    public void swap(int[] nums, int end) {
        for (int i = end; i > 0; i--) {
            int temp = nums[i];
            nums[i] = nums[i - 1];
            nums[i - 1] = temp;
        }
    }
}
