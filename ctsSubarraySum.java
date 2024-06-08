import java.util.HashMap;
import java.util.Map;

public class ctsSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefixMod = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixMod = (prefixMod + nums[i]) % k;
            if (map.containsKey(prefixMod)) {
                if (i - map.get(prefixMod) > 1) return true;
            } else {
                map.put(prefixMod, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{23, 2, 4, 6, 7};
        int k = 6;
        ctsSubarraySum ctsSubarraySum = new ctsSubarraySum();
        System.out.println(ctsSubarraySum.checkSubarraySum(nums, k));
    }
}
