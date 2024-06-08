var checkSubarraySum = function(nums, k) {
    let prefixMod = 0;
    let map = new Map();
    map.set(0, -1);

    for (let i = 0; i < nums.length; i++) {
        prefixMod = (prefixMod + nums[i]) % k;
        if (map.has(prefixMod)) {
            if (i - map.get(prefixMod) > 1) return true;
        } else {
            map.set(prefixMod, i);
        }
    }

    return false;
};