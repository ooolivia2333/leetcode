var groupAnagrams = function(strs) {
    let map = new Map();
    for (let str of strs) {
        let sorted = str.split('').sort().join('');
        if (!map.has(sorted)) {
            map.set(sorted, []);
        }
        let list = map.get(sorted);
        list.push(str);
        map.set(sorted, list);
    }

    let result = [];
    for (let key of map.keys()) {
        result.push([]);
        for (let value of map.get(key)) {
            result[result.length-1].push(value);
        }
    }
    return result;
};

let strs = ["eat","tea","tan","ate","nat","bat"];
console.log(groupAnagrams(strs));