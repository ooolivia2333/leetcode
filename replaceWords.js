class TrieNode {
    constructor() {
        this.children = {};
        this.isEnd = false;
    }
}

class Trie {
    constructor() {
        this.root = new TrieNode();
    }

    insert(word) {
        let curr = this.root;
        for (let c of word) {
            if (!curr.children[c]) {
                curr.children[c] = new TrieNode;
            }
            curr = curr.children[c];
        }
        curr.isEnd = true;
    }

    shortest_root(word) {
        let curr = this.root;
        for (let i = 0; i < word.length; i++) {
            let c = word.charAt(i);
            if (!curr.children[c]) return word;
            curr = curr.children[c];
            if (curr.isEnd) return word.substring(0, i+1);
        }
        return word;
    }
}

var replaceWords = function(dictionary, sentence) {
    let dict_trie = new Trie();
    word_array = sentence.split(' ');

    for (let word of dictionary) {
        dict_trie.insert(word);
    }

    for (let i = 0; i < word_array.length; i++) {
        word_array[i] = dict_trie.shortest_root(word_array[i]);
    }

    return word_array.join(' ');
};

console.log(replaceWords(["cat","bat","rat"], "the cattle was rattled by the battery"))