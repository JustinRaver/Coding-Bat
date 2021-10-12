package Array2;

import java.util.Arrays;

public class CenteredAverage {
    /**
     * Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
     * <p>
     * <p>
     * centeredAverage([1, 2, 3, 4, 100]) → 3
     * centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
     * centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     *
     * @param nums
     * @return
     */
    public int centeredAverage(int[] nums) {
        Arrays.sort(nums);

        int average = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            average += nums[i];
        }
        return average / (nums.length - 2);
    }
}
