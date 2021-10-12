package Array2;

public class CountEvens {
    /**
     * Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
     * <p>
     * <p>
     * countEvens([2, 1, 2, 3, 4]) → 3
     * countEvens([2, 2, 0]) → 3
     * countEvens([1, 3, 5]) → 0
     *
     * @param nums
     * @return
     */
    public int countEvens(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
