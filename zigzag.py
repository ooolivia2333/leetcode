class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        n = len(s)
        ans = ""
        charsInSection = 2*numRows - 2

        for currRow in range(numRows):
            index = currRow
            while index < n:
                ans += s[index]
                if currRow != 0 and currRow != numRows-1:
                    charsInBetween = charsInSection - 2 * currRow
                    secondIndex = index + charsInBetween
                    if secondIndex < n:
                        ans += s[secondIndex]
                index += charsInSection

        return ans