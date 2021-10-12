package Array2;

import java.util.ArrayList;
import java.util.List;

public class Pre4 {
    /**
     * Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
     * <p>
     * <p>
     * pre4([1, 2, 4, 1]) → [1, 2]
     * pre4([3, 1, 4]) → [3, 1]
     * pre4([1, 4, 4]) → [1]
     *
     * @param nums
     * @return
     */
    public int[] pre4(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) {
                list.add(nums[i]);
            } else {
                break;
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
