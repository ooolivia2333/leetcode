
import java.util.Arrays;

class numberOfGoodPairsI {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] *= k;
        }
        int ans = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] < nums2[j]) continue;
                if (nums1[i] % nums2[j] == 0) ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 4, 12};
        int[] nums2 = new int[]{2, 4};
        int k = 3;
        numberOfGoodPairsI numGoodPairsI =  new numberOfGoodPairsI();
        System.out.println(numGoodPairsI.numberOfPairs(nums1, nums2, k));
    }
}