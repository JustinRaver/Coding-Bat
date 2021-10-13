package AP1;

/**
 * (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index. We'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes into the array with start <= end.
 * <p>
 * <p>
 * bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
 * bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
 * bigHeights([5, 3, 6, 7, 2], 0, 4) → 1
 */
public class BigHeights {
    public int bigHeights(int[] heights, int start, int end) {
        int numBigSteps = 0;

        for (int i = start; i < end; i++) {
            numBigSteps += sum(heights, i, i + 1);
        }
        return numBigSteps;
    }

    public int sum(int[] h, int idx1, int idx2) {
        int a = h[idx1];
        int b = h[idx2];

        if (a > b) {
            return (a - b >= 5) ? 1 : 0;
        } else if (b > a) {
            return b - a >= 5 ? 1 : 0;
        } else {
            return 0;
        }
    }
}
