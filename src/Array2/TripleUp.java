package Array2;

public class TripleUp {
    /**
     * Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
     * <p>
     * <p>
     * tripleUp([1, 4, 5, 6, 2]) → true
     * tripleUp([1, 2, 3]) → true
     * tripleUp([1, 2, 4]) → false
     *
     * @param nums
     * @return
     */
    public boolean tripleUp(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        int num = nums[0];
        int count = 1;
        for (int i : nums) {
            if (++num == i) {
                count++;
                if (count >= 3) {
                    return true;
                }
            } else {
                count = 1;
                num = i;
            }
        }
        return false;
    }
}
