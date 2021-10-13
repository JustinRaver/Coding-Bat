package Array3;

/**
 * Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
 * <p>
 * <p>
 * squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
 * squareUp(2) → [0, 1, 2, 1]
 * squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */
public class SquareUp {
    public int[] squareUp(int n) {
        // 0, 0, 1
        // 0, 2, 1
        // 3, 2, 1

        int[] a = new int[n * n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                a[count] = i + 1 >= j ? j : 0;
                count++;
            }
        }
        return a;
    }
}
