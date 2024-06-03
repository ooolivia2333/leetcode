var firstMissingPositive = function(nums) {
    let n = nums.length;
    let contains1 = false;
    for (let i = 0; i < n; i++) {
        if (nums[i] === 1) contains1 = true;
        if (nums[i] < 1 || nums[i] > n) nums[i] = 1;
    }
    if (!contains1) return 1;
    for (let j = 0; j < n; j++) {
        let curr = Math.abs(nums[j]);
        if (curr === n) nums[0] = -Math.abs(nums[0]);
        else nums[curr] = -Math.abs(nums[curr]);
    }

    for (let k = 1; k < n; k++) {
        if (nums[k] > 0) return k;
    }
    if (nums[0] > 0) return n;
    return n+1;
}

console.log(firstMissingPositive([1, 2, 0]));