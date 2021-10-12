package Array1;

public class MidThree {
    /**
     * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
     * <p>
     * <p>
     * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
     * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
     * midThree([1, 2, 3]) → [1, 2, 3]
     *
     * @param nums
     * @return
     */
    public int[] midThree(int[] nums) {
        if (nums.length == 3) {
            return nums;
        }
        int[] retVal = new int[3];
        int val = (nums.length - 3) / 2;
        for (int i = val; i < nums.length - val; i++) {
            retVal[i - val] = nums[i];
        }
        return retVal;
    }
}
