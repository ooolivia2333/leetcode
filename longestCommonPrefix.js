var longestCommonPrefix = function(strs) {
    for (let i = 0; i < strs[0].length; i++) {
        let c = strs[0].charAt(i);
        for (let j = 1; j < strs.length; j++) {
            if (i === strs[j].length || strs[j].charAt(i) !== c) {
                return strs[j].substring(0, i);
            }
        }
    }
    return strs[0];
}

console.log(longestCommonPrefix(["", "d"]))