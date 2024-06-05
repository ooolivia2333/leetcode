var removeKdigits = function(num, k) {
    if (k >= num.length) return "0";

    let stack = [];
    for (let c of num) {
        while (stack.length > 0 && stack[stack.length-1] > c && k > 0) {
            stack.pop();
            k--;
        }
        stack.push(c);
    }

    while (k > 0) {
        stack.pop();
        k--;
    }

    let ans = "";
    let leadingZero = true;
    for (let c of stack) {
        if (leadingZero && c == '0') continue;
        leadingZero = false;
        ans += c;
    }

    if (ans.length == 0) return "0";
    return ans;
};

console.log(removeKdigits("1432219", 3));