public class subarryBitwiseAnd {
    public int minimumDifference(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            for (int j = i; j < nums.length; j++) {
                x &= nums[j];

                ans = Math.min(ans, Math.abs(x - k));

                if (x <= k) break;
            }
        }
        return ans;
    }
}
