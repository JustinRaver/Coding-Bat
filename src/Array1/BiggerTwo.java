package Array1;

public class BiggerTwo {
    /**
     * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
     * <p>
     * <p>
     * biggerTwo([1, 2], [3, 4]) → [3, 4]
     * biggerTwo([3, 4], [1, 2]) → [3, 4]
     * biggerTwo([1, 1], [1, 2]) → [1, 2]
     *
     * @param a
     * @param b
     * @return
     */
    public int[] biggerTwo(int[] a, int[] b) {
        int aSum = 0;
        int bSum = 0;
        for (int i = 0; i < 2; i++) {
            aSum += a[i];
            bSum += b[i];
        }
        return aSum >= bSum ? a : b;
    }
}
