package Array1;

public class Front11 {
    /**
     * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
     * <p>
     * <p>
     * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
     * front11([1], [2]) → [1, 2]
     * front11([1, 7], []) → [1]
     *
     * @param a
     * @param b
     * @return
     */
    public int[] front11(int[] a, int[] b) {
        int aal = a.length;
        int bal = b.length;
        if (aal > 0 && bal > 0) {
            return new int[]{a[0], b[0]};
        } else if (bal > 0) {
            return new int[]{b[0]};
        } else if (aal > 0) {
            return new int[]{a[0]};
        }
        return new int[]{};
    }
}
