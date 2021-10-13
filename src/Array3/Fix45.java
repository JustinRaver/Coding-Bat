package Array3;

/**
 * (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.
 * <p>
 * <p>
 * fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
 * fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
 * fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
 */
public class Fix45 {
    public int[] fix45(int[] nums) {
        int i = 0;
        int j = 0;

        while (i < nums.length - 1 && j < nums.length) {
            while (i < nums.length - 1 && nums[i] != 4) {
                i++;
            }
            while (j < nums.length && nums[j] != 5) {
                if (nums[j] == 4 && nums[j + 1] == 5) {
                    j += 2;
                } else {
                    j++;
                }
            }

            if ((i < nums.length && nums[i] == 4) && (j < nums.length && nums[j] == 5)) {
                if (nums[i + 1] == 5) {
                    j--;

                } else {
                    swap(nums, i + 1, j);
                }
            }

            i++;
            j++;
        }
        return nums;
    }

    public void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
