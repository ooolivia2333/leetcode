
import java.util.HashMap;
import java.util.Map;

public class numOfGoodPairsII {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], map.getOrDefault(nums2[i], 0)+1);
        }
        long ans = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % k == 0) {
                nums1[i] /= k;
                for (int j = 1; j <= Math.sqrt(nums1[i]); j++) {
                    if (nums1[i] % j == 0) {
                        ans += map.getOrDefault(j, 0);
                        if (nums1[i] / j != j) ans += map.getOrDefault(nums1[i] / j, 0);
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 4, 12};
        int[] nums2 = new int[]{2, 4};
        int k = 1;
        numOfGoodPairsII numGoodPairsII =  new numOfGoodPairsII();
        System.out.println(numGoodPairsII.numberOfPairs(nums1, nums2, k));
    }
}
