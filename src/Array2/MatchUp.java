package Array2;

public class MatchUp {
    /**
     * Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
     * <p>
     * <p>
     * matchUp([1, 2, 3], [2, 3, 10]) → 2
     * matchUp([1, 2, 3], [2, 3, 5]) → 3
     * matchUp([1, 2, 3], [2, 3, 3]) → 2
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int matchUp(int[] nums1, int[] nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.length; i++) {
            sum += differ(nums1[i], nums2[i]);
        }
        return sum;
    }

    public int differ(int a, int b) {
        if (Math.abs(a - b) > 0 && Math.abs(a - b) <= 2) {
            return 1;
        }
        return 0;
    }
}
