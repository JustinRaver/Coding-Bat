package Array2;

public class No14 {
    /**
     * Given an array of ints, return true if it contains no 1's or it contains no 4's.
     * <p>
     * <p>
     * no14([1, 2, 3]) → true
     * no14([1, 2, 3, 4]) → false
     * no14([2, 3, 4]) → true
     *
     * @param nums
     * @return
     */
    public boolean no14(int[] nums) {
        boolean found1 = false;
        boolean found4 = false;

        for (int i : nums) {
            if (found1 && i == 4) {
                return false;
            }
            if (found4 && i == 1) {
                return false;
            }

            if (i == 1) {
                found1 = true;
            }
            if (i == 4) {
                found4 = true;
            }
        }
        return true;
    }
}
