public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int maxn = Integer.MAX_VALUE;
        for (String str: strs) maxn = Math.min(maxn, str.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxn; i++) {
            char c = strs[0].charAt(i);
            boolean consistent = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    consistent = false;
                    break;
                }
            }
            if (!consistent) break;
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[]strs = new String[] {"dog", ""};
        longestCommonPrefix lCommonPrefix = new longestCommonPrefix();
        System.out.println(lCommonPrefix.longestCommonPrefix(strs));
    }
}
