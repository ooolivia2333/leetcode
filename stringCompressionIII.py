class Solution:
    def __init__(self) -> None:
        pass

    def compressedString(self, word: str) -> str:
        words = list(word)
        ans = ""
        i = 0
        while i < len(words):
            count = 0
            curr = words[i]
            while i < len(words) and words[i] == curr and count < 9:
                i+=1
                count+=1
            ans += str(count) + curr
        
        return ans
    
def main():
    solution = Solution()
    print(solution.compressedString("aaaaaaaaaaaaaabb"))

if __name__ == "__main__":
    main()