import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int mid = n / 2;
        Arrays.sort(nums);
        int res = 0;
        for (int x : nums) {
            res += Math.abs(nums[mid] - x);
        }

        return res;
    }
}