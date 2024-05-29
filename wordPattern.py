class Solution:
    def __init__(self) -> None:
        pass

    def wordPattern(self, pattern: str, s: str) -> bool:
        map = {}
        s = s.split(' ')
        if len(s) != len(pattern):
            return False

        for i, (c, w) in enumerate(zip(s, pattern)):
            c = "char_"+c
            w = "word_"+w
            if c not in map:
                map[c] = i
            if w not in map:
                map[w] = i
            if map[c] != map[w]:
                return False
        
        return True

    
def main():
    solution = Solution()
    print(solution.wordPattern("aaaa", "dog cat cat dog"))

if __name__ == "__main__":
    main()