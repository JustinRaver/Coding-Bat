package AP1;

import java.util.HashSet;
import java.util.Set;

/**
 * Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.
 * <p>
 * <p>
 * commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
 * commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
 * commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
 */
public class CommonTwo {
    public int commonTwo(String[] a, String[] b) {
        Set<String> set = new HashSet<>();

        int idx1 = 0;
        int idx2 = 0;

        int aLen = a.length - 1;
        int bLen = b.length - 1;

        while (idx1 <= aLen && idx2 <= bLen) {
            String aStr = a[idx1];
            String bStr = b[idx2];

            int comp = aStr.compareTo(bStr);

            if (comp == 0) {
                set.add(aStr);
                idx1++;
                idx2++;
            } else if (comp < 0) {
                idx1++;
            } else {
                idx2++;
            }
        }
        return set.size();
    }
}
