package Array2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Post4 {
    /**
     * Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
     * <p>
     * <p>
     * post4([2, 4, 1, 2]) → [1, 2]
     * post4([4, 1, 4, 2]) → [2]
     * post4([4, 4, 1, 2, 3]) → [1, 2, 3]
     *
     * @param nums
     * @return
     */
    public int[] post4(int[] nums) {
        List<Integer> list = new LinkedList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 4) {
                list.add(nums[i]);
            } else {
                break;
            }
        }
        Collections.reverse(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
