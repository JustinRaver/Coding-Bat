package Array3;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
 * <p>
 * <p>
 * linearIn([1, 2, 4, 6], [2, 4]) → true
 * linearIn([1, 2, 4, 6], [2, 3, 4]) → false
 * linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */
public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        int a1 = 0;
        int a2 = 0;

        while (a2 < inner.length && a1 < outer.length) {
            if (outer[a1] == inner[a2]) {
                a2++;
            } else if (a2 < inner.length && outer[a1] < inner[a2]) {
                a1++;
            } else {
                return false;
            }
        }
        return a2 == inner.length;
    }
}
