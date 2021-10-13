package Warmup2;

/**
 * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
 * <p>
 * <p>
 * noTriples([1, 1, 2, 2, 1]) → true
 * noTriples([1, 1, 2, 2, 2, 1]) → false
 * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */
public class NoTriples {
    public boolean noTriples(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        int count = 0;
        int curVal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curVal == nums[i]) {
                count++;
            } else {
                curVal = nums[i];
                count = 1;
            }
            if (count > 2) {
                return false;
            }
        }
        return true;
    }
}
