package Array1;

public class Unlucky1 {
    /**
     * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
     * <p>
     * <p>
     * unlucky1([1, 3, 4, 5]) → true
     * unlucky1([2, 1, 3, 4, 5]) → true
     * unlucky1([1, 1, 1]) → false
     *
     * @param nums
     * @return
     */
    public boolean unlucky1(int[] nums) {
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1) {
                if (nums[i] == 1 && nums[i + 1] == 3) {
                    if (i < 2 || i > nums.length - 3) {
                        found = true;
                    }
                }
            }
        }
        return found;
    }

}
