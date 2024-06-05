var commonChars = function(words) {
    common_counts = Array(26).fill(0);
    curr_counts =  Array(26).fill(0);
    
    for (let c of words[0]) {
        common_counts[c.charCodeAt(0)-'a'.charCodeAt(0)]++;
    }

    for (let i = 1; i < words.length; i++) {
        let currStr = words[i];
        curr_counts.fill(0);
        for (let c of currStr) {
            curr_counts[c.charCodeAt(0)-'a'.charCodeAt(0)]++;
        }
        for (let j = 0; j < 26; j++) {
            common_counts[j] = Math.min(common_counts[j], curr_counts[j])
        }
    }

    let ans = [];
    for (let i = 0; i < 26; i++) {
        let repeat = common_counts[i];
        for (let j = 0; j < repeat; j++) {
            ans.push(String.fromCharCode(i + 'a'.charCodeAt(0)));
        }
    }

    return ans;
};

console.log(commonChars(["bella","label","roller"]));