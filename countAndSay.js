var countAndSay = function(n) {
    let ans = "1";
    if (n === 1) return ans;
    for (let i = 2; i <= n; i++) {
        console.log(ans);
        ans = say(ans);
    }
    return ans;

    function say(str) {
        let curr = str[0];
        let count = 0;
        let ans = "";
        for (let i = 0; i <= str.length; i++) {
            if (str[i] === curr) count++;
            else {
                ans += count+curr;
                if (i < str.length) {
                    count = 1;
                    curr = str[i];
                }
            }
        }
        return ans;
    }
}

console.log(countAndSay(4));