class Solution:
    def __init__(self) -> None:
        pass

    def removeKdigits(self, num: str, k: int) -> str:
        if k >= len(num):
            return "0"
        
        stack = []

        for c in num:
            while len(stack) > 0 and stack[-1] > c and k > 0:
                stack.pop()
                k-=1
            stack.append(c)
        
        while k > 0:
            stack.pop()
            k-=1

        return "".join(stack).lstrip('0') or "0"
    
def main():
    print(Solution().removeKdigits("1234567890", 9))

if __name__ == "__main__":
    main()