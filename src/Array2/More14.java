package Array2;

public class More14 {
    /**
     * Given an array of ints, return true if the number of 1's is greater than the number of 4's
     * <p>
     * <p>
     * more14([1, 4, 1]) → true
     * more14([1, 4, 1, 4]) → false
     * more14([1, 1]) → true
     *
     * @param nums
     * @return
     */
    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;

        for (int i : nums) {
            if (i == 1) {
                count1++;
            } else if (i == 4) {
                count4++;
            }
        }
        return count1 > count4;
    }
}
