import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) set.remove(nums[i-k]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        int k = 2;
        containsDuplicate containsDuplicate = new containsDuplicate();
        System.out.println(containsDuplicate.containsNearbyDuplicate(nums, k));
    }
}
