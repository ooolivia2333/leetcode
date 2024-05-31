public class StringCompressionIII {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char curr = word.charAt(0);
        while (i < word.length()) {
            int count = 1;
            curr = word.charAt(i);
            while(++i < word.length() && word.charAt(i) == word.charAt(i-1) && count < 9) {
                count++;
            }
            sb.append(count);
            sb.append(curr);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";
        StringCompressionIII stringCompressionIII = new StringCompressionIII();
        System.out.println(stringCompressionIII.compressedString(word));
    }
}
