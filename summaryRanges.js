var summaryRanges = function(nums) {
    if (nums.length === 0) return []

    let ans = [];
    let start = nums[0];
    for (let i = 1; i <= nums.length; i++) {
        if (i === nums.length || nums[i] != nums[i-1] + 1) {
            let end = nums[i-1];
            if (start === end) {
                ans.push(String(start));
            } else {
                ans.push(String(start) + "->" + String(end));
            }
            start = nums[i];
        }
    }
    return ans;
};