public class minNumberOfChairs {
    public int minimumChairs(String s) {
        if (s.length() == 0) return 0;

        int ans = 0;
        int curr = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E'){
                curr++;
                ans = Math.max(ans, curr);
            }
            else curr--;
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "ELEELEELLL";
        minNumberOfChairs minNumberOfChairs = new minNumberOfChairs();
        System.out.println(minNumberOfChairs.minimumChairs(s));
    }
}
