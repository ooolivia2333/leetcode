public class equalSubstring {
    // 1208. Get Equal Substrings Within Budget
    public int equalSubstring(String s, String t, int maxCost) {
        int start = -1, ans = 0, currCost = 0;
        for (int end = 0; end < s.length(); end++) {
            currCost += Math.abs(s.charAt(end) - t.charAt(end));
            while (currCost > maxCost) currCost -= Math.abs(s.charAt(++start) - t.charAt(start));
            ans = Math.max(ans, end - start);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcd", t = "acde";
        int maxCost = 0;
        equalSubstring eSubstring = new equalSubstring();
        System.out.println(eSubstring.equalSubstring(s, t, maxCost));
    }
}
