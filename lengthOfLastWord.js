var lengthOfLastWord = function(s) {
    let words = s.trim();
    return words.length - words.lastIndexOf(" ") - 1;
}

console.log(lengthOfLastWord("Hello World"));