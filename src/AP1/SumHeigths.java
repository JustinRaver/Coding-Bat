package AP1;

/**
 * We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6. The start end end index will both be valid indexes into the array with start <= end.
 * <p>
 * <p>
 * sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
 * sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
 * sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
 */
public class SumHeigths {
    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += sum(heights, i, i + 1);
        }
        return sum;
    }

    public int sum(int[] h, int idx1, int idx2) {
        if (h[idx1] > h[idx2]) {
            return h[idx1] - h[idx2];
        } else if (h[idx2] > h[idx1]) {
            return h[idx2] - h[idx1];
        } else {
            return 0;
        }
    }
}
