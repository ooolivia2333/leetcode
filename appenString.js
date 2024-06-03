var appendCharacters = function(s, t) {
    let index1 = 0, index2 = 0;
    while (index1 < s.length && index2 < t.length) {
        if (s.charAt(index1) === t.charAt(index2)) {
            index2++;
        }
        index1++;
    }
    return t.length - index2;
}