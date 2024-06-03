var convert = function(s, numRows) {
    if (numRows === 1) return s;
    let charsInSection = numRows * 2 - 2;
    let ans = "";
    for (let currRow = 0; currRow < numRows; currRow++) {
        let index = currRow;
        while (index < s.length) {
            ans += s.charAt(index);
            if (currRow != 0 && currRow != numRows - 1) {
                let charsInBetween = charsInSection - 2*currRow;
                let secondIndex = charsInBetween + index;
                if (secondIndex < s.length) ans += s.charAt(secondIndex);
            }
            index += charsInSection;
        }
    }
    return ans;
};

console.log(convert("PAYPALISHIRING", 3))