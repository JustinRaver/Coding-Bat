package AP1;

/**
 * Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
 * <p>
 * <p>
 * scoresClump([3, 4, 5]) → true
 * scoresClump([3, 4, 6]) → false
 * scoresClump([1, 3, 5, 5]) → true
 */
public class ScoresClump {
    public boolean scoresClump(int[] scores) {
        for (int i = 1; i < scores.length - 1; i++) {
            if (diffAdjacent(scores, i)) {
                return true;
            }
        }
        return false;
    }

    //Helper for looking at 3 adjacent
    public boolean diffAdjacent(int[] scores, int i) {
        return diff(scores[i], scores[i - 1]) && diff(scores[i], scores[i + 1]) && diff(scores[i + 1], scores[i - 1]);
    }

    //Helper for diff
    public boolean diff(int a, int b) {
        return Math.abs(a - b) <= 2;
    }
}
