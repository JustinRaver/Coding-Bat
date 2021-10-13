package Array3;

/**
 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
 * <p>
 * <p>
 * seriesUp(3) → [1, 1, 2, 1, 2, 3]
 * seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 * seriesUp(2) → [1, 1, 2]
 */
public class SeriesUp {
    public int[] seriesUp(int n) {
        int[] a = new int[n * (n + 1) / 2];

        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                a[idx] = j;
                idx++;
            }
        }
        return a;
    }
}
