package AP1;

/**
 * Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.
 * <p>
 * <p>
 * scores100([1, 100, 100]) → true
 * scores100([1, 100, 99, 100]) → false
 * scores100([100, 1, 100, 100]) → true
 */
public class Scores100 {
    public boolean scores100(int[] scores) {
        int prev = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == 100 && prev == 100) {
                return true;
            }
            prev = scores[i];
        }
        return false;
    }
}
