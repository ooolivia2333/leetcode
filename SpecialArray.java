

public class SpecialArray {
    // 1608. Special Array With X Elements Greater Than or Equal X

    public static int specialArray(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+1];
        for (int num: nums) {
            freq[Math.min(n, num)]++;
        }

        int equalOrGreater = 0;
        for (int i = n; i >= 0; i--) {
            equalOrGreater += freq[i];
            if (equalOrGreater == i) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 6, 7, 7, 0};
        System.out.println(specialArray(nums));
    }
}
