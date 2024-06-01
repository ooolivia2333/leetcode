var intToRoman = function(num) {
    const values = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];
    const symbols = [
        "M",
        "CM",
        "D",
        "CD",
        "C",
        "XC",
        "L",
        "XL",
        "X",
        "IX",
        "V",
        "IV",
        "I",
    ];
    ans = "";
    for (let i = 0; i < values.length && num > 0; i++) {
        if (num >= values[i]) {
            let repeat = Math.floor(num/values[i]);
            for (let j = 0; j < repeat; j++) {
                ans += symbols[i];
            }
            num %= values[i];
        }
    }
    return ans;

}

console.log(intToRoman(3749));