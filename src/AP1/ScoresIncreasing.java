package AP1;

/**
 * Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
 * <p>
 * <p>
 * scoresIncreasing([1, 3, 4]) → true
 * scoresIncreasing([1, 3, 2]) → false
 * scoresIncreasing([1, 1, 4]) → true
 */
public class ScoresIncreasing {
    public boolean scoresIncreasing(int[] scores) {
        int prev = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (prev > scores[i]) {
                return false;
            }
            prev = scores[i];
        }
        return true;
    }
}
