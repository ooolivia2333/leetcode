var longestPalindrome = function(s) {
    let map = new Map();
    let oddCount = 0;
    for (let c of s) {
        map.set(c, (map.get(c) || 0) + 1);
        if (map.get(c) % 2 === 1) oddCount++;
        else oddCount--;
    }
    if (oddCount > 0) return s.length - oddCount + 1;
    else return s.length;
};