package Array2;

public class HaveThree {
    /**
     * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
     * <p>
     * <p>
     * haveThree([3, 1, 3, 1, 3]) → true
     * haveThree([3, 1, 3, 3]) → false
     * haveThree([3, 4, 3, 3, 4]) → false
     *
     * @param nums
     * @return
     */
    public boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                i++;
            }
        }
        return count == 3;
    }
}
