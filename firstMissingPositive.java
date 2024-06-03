public class firstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        boolean contains1 = false;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) contains1 = true;
            if (nums[i] <= 0 || nums[i] > n) nums[i] = 1;
        }
        if (!contains1) return 1;
        for (int i = 0; i < nums.length; i++) {
            int curr = Math.abs(nums[i]);
            if (curr == n) nums[0] = -Math.abs(nums[0]);
            else nums[curr] = -Math.abs(nums[curr]);
        }
        for (int i = 1; i < n; i++) {
            if (nums[i] > 0) return i;
        }
        if (nums[0] > 0) return n;
        return n+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 0};
        firstMissingPositive fMissingPositive = new firstMissingPositive();
        System.out.println(fMissingPositive.firstMissingPositive(nums));
    }
}
