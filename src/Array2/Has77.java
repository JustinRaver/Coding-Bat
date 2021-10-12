package Array2;

public class Has77 {
    /**
     * Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
     * <p>
     * <p>
     * has77([1, 7, 7]) → true
     * has77([1, 7, 1, 7]) → true
     * has77([1, 7, 1, 1, 7]) → false
     *
     * @param nums
     * @return
     */
    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 7) {
                if (nums[i + 1] == 7) {
                    return true;
                } else if (nums[i + 2] == 7) {
                    return true;
                }
            }
            if (nums[i + 1] == 7 && nums[i + 2] == 7) {
                return true;
            }
        }
        return false;
    }
}
