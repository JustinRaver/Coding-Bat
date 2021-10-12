package Array2;

public class Mod3 {
    /**
     * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
     * <p>
     * <p>
     * modThree([2, 1, 3, 5]) → true
     * modThree([2, 1, 2, 5]) → false
     * modThree([2, 4, 2, 5]) → true
     *
     * @param nums
     * @return
     */
    public boolean modThree(int[] nums) {
        int odd = 0;
        int even = 0;

        for (int i : nums) {
            if (i % 2 == 0) {
                odd = 0;
                even++;
            } else {
                odd++;
                even = 0;
            }
            if (even == 3 || odd == 3) {
                return true;
            }
        }
        return false;
    }
}
