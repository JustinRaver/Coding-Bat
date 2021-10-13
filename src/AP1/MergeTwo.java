package AP1;

/**
 * Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.
 * <p>
 * <p>
 * mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
 * mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
 * mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
 */
public class MergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] temp = new String[n];
        for (int i = 0; i < n; i++) {
            String small;
            String big;

            small = a[i].compareTo(b[i]) < 0 ? a[i] : b[i];
            big = a[i].compareTo(b[i]) > 0 ? a[i] : b[i];

            if (small.compareTo(big) == 0) {
                big = "z";
            }
            if (i > 0) {
                if (temp[i].compareTo(small) < 0) {
                    big = small;
                    small = temp[i];
                } else if (temp[i].compareTo(big) < 0) {
                    if (small.compareTo(temp[i]) != 0) {
                        big = temp[i];
                    }
                }
            }
            if (i < n - 1) {

                temp[i + 1] = big;
            }
            temp[i] = small;
        }
        return temp;
    }
}
