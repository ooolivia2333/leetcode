public class zigzag {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int charsInsection = numRows * 2 - 2, n = s.length();
        for (int currRow = 0; currRow < numRows; currRow++) {
            int index = currRow;
            while (index < n) {
                sb.append(s.charAt(index));
                if (currRow != 0 && currRow != numRows - 1) {
                    int charsInBetween = charsInsection - currRow * 2;
                    int secondIndex = index + charsInBetween;
                    if (secondIndex < n) sb.append(s.charAt(secondIndex));
                }
                index += charsInsection;
            }
        } 
        return sb.toString();
    }

    public static void main(String[] args) {
        zigzag zigzag = new zigzag();
        System.out.println(zigzag.convert("PAYPALISHIRING", 3));
    }
}
