
import java.util.Arrays;

public class maxSumofSubsequence {
    int MODULO = 1000000007;
    // 3165. Maximum Sum of Subsequence With Non-adjacent Elements
    public int maximumSumSubsequence(int[] nums, int[][] queries) {
        int ans = 0;
        for (int i = 0; i < queries.length; i++) {
            nums[queries[i][0]] = queries[i][1];
            int[] memo = new int[nums.length];
            Arrays.fill(memo,-1);
            System.out.println(dp(nums, 0, memo));
            ans = (ans + dp(nums, 0, memo)) % MODULO;
        }

        return ans;
    }

    private int dp(int[] nums, int index, int[] memo) {
        if (index >= nums.length) return 0;
        if (memo[index] != -1) return memo[index];
        int ans = 0;
        //include;
        ans = (nums[index] + dp(nums, index+2, memo)) % MODULO;
        //not include
        ans = Math.max(ans, (dp(nums, index+1, memo)) % MODULO);
        return memo[index] = ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 3, 3, 3, 1, -2};
        int[][] queries = new int[][] {{4, 0}, {1, 0}};
        maxSumofSubsequence maxSumofSubsequence = new maxSumofSubsequence();
        System.out.println(maxSumofSubsequence.maximumSumSubsequence(nums, queries));
    }
}
