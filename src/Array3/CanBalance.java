package Array3;

/**
 * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 * <p>
 * <p>
 * canBalance([1, 1, 1, 2, 1]) → true
 * canBalance([2, 1, 1, 2, 1]) → false
 * canBalance([10, 10]) → true
 */
public class CanBalance {
    public boolean canBalance(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        int start = 0;
        int end = nums.length - 1;

        int first = nums[start++];
        int last = nums[end--];

        while (start <= end) {
            if (first < last) {
                first += nums[start++];
            } else {
                last += nums[end--];
            }
        }
        return first == last;
    }
}
