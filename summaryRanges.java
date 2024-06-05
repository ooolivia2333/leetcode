import java.util.ArrayList;
import java.util.List;

public class summaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        
        List<String> ans = new ArrayList<>();
        int start = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i-1] + 1) {
                int end = nums[i-1];
                if (start == end) {
                    ans.add(String.valueOf(start));
                } else {
                    ans.add(String.valueOf(start) + "->" + String.valueOf(end));
                }
                if (i < nums.length) start = nums[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        summaryRanges summaryRanges = new summaryRanges();
        System.out.println(summaryRanges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }
}
