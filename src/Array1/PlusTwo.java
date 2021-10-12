package Array1;

public class PlusTwo {
    /**
     * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
     * <p>
     * <p>
     * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
     * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
     * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
     *
     * @param a
     * @param b
     * @return
     */
    public int[] plusTwo(int[] a, int[] b) {
        int[] retVal = new int[a.length * 2];
        int count = 0;
        for (int element : a) {
            retVal[count] = element;
            count++;
        }
        for (int element : b) {
            retVal[count] = element;
            count++;
        }
        return retVal;
    }
}
