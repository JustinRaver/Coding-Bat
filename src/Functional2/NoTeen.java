package Functional2;

import java.util.List;

/**
 * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
 * <p>
 * <p>
 * noTeen([12, 13, 19, 20]) → [12, 20]
 * noTeen([1, 14, 1]) → [1, 1]
 * noTeen([15]) → []
 */
public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n > 12 && n < 20);
        return nums;
    }
}
