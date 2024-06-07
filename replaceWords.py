from typing import List
import sys

class TrieNode:
    def __init__(self) -> None:
        self.isEnd = False
        self.children = [None] * 26

class DictTrie:
    def __init__(self) -> None:
        self.root = TrieNode()
    
    def insert(self, word):
        curr = self.root
        for c in word:
            if curr.children[ord(c) - ord('a')] is None:
                curr.children[ord(c) - ord('a')] = TrieNode()
            curr = curr.children[ord(c) - ord('a')]
        curr.isEnd = True
    
    def shorted_root(self, word):
        curr = self.root
        for i in range(len(word)):
            c = word[i]
            if curr.children[ord(c) - ord('a')] is None:
                return word
            curr = curr.children[ord(c) - ord('a')]
            if curr.isEnd:
                return word[:i+1]
        return word

class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        word_array = sentence.split()
        
        dict_trie = DictTrie()
        for word in dictionary:
            dict_trie.insert(word)
        
        for i in range(len(word_array)):
            word_array[i] = dict_trie.shorted_root(word_array[i])
        
        return ' '.join(word_array)

def main():
    print(Solution().replaceWords(["cat", "bat", "rat"], "the cattle was rattled by the battery"))

if __name__ == "__main__":
    main()