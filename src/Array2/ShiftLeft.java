package Array2;

import java.util.LinkedList;
import java.util.List;

public class ShiftLeft {
    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
     * <p>
     * <p>
     * shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
     * shiftLeft([1, 2]) → [2, 1]
     * shiftLeft([1]) → [1]
     *
     * @param nums
     * @return
     */
    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        List<Integer> list = new LinkedList<>();

        for (int i = 1; i < nums.length; i++) {
            list.add(nums[i]);
        }
        list.add(nums[0]);

        int[] ret = list.stream().mapToInt(i -> i).toArray();
        return ret;
    }
}
