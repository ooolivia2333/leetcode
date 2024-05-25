public class MinSizeSubarraySum {
    // 209. Minimum Size Subarray Sum
    public static int minSubArrayLen(int target, int[] nums) {
        int start = -1, curr = 0, ans = Integer.MAX_VALUE;
        for (int end = 0; end < nums.length; end++) {
            curr += nums[end];
            while (curr >= target) {
                ans = Math.min(ans, end-start);
                curr -= nums[++start];
            }
        }

        return start == -1? 0: ans;
    }

    public static void main(String[] args) {
        int target = 11;
        int[] nums = new int[]{1, 1, 1, 1, 1};
        System.out.println(minSubArrayLen(target, nums));
    }
}
