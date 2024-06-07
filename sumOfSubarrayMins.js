var sumSubarrayMins = function(arr) {
    stack = []
    ans = 0
    MOD = 1000000007;

    for (let i = 0; i <= arr.length; i++) {
        while (stack.length > 0 && (i === arr.length || arr[stack[stack.length - 1]] >= arr[i])) {
            let mid = stack.pop();
            let right = i;
            let left = stack.length === 0? -1: stack[stack.length-1];

            let count = (mid - left) * (right - mid) % MOD;
            let contribution = arr[mid] * count % MOD;
            ans = (ans + contribution) % MOD;
        }
        stack.push(i);
    }

    return ans;
};