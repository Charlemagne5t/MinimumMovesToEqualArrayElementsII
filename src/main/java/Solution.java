import java.util.Arrays;

public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        if (nums.length % 2 != 0) {
            return countMoves(nums, nums[nums.length / 2]);
        } else {
            return Math.min(countMoves(nums, nums[nums.length / 2 - 1]), countMoves(nums, nums[nums.length / 2] + 1));
        }
    }

    private int countMoves(int[] nums, int target) {
        int moves = 0;
        for (int i = 0; i < nums.length; i++) {
            moves += Math.abs(nums[i] - target);
        }
        return moves;
    }
}
