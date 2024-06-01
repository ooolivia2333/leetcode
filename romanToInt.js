let map = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000,
    IV: 4,
    IX: 9,
    XL: 40,
    XC: 90,
    CD: 400,
    CM: 900,
};

var romanToInt = function(s) {
    let i = 0, ans = 0;
    while (i < s.length) {
        if (i < s.length - 1 && s.substring(i, i+2) in map) {
            ans += map[s.substring(i, i+2)];
            i+=2;
        } else {
            ans += map[s.substring(i, i+1)];
            i++;
        }
    }
    return ans;
}

console.log(romanToInt("LVIII"));