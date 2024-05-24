class Solution {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) /2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid+1;
            else right = mid;
        }
        
        return left;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(nums, 7));
    }
}

