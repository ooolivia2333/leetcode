public class canConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--count[ransomNote.charAt(i) - 'a'] < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        canConstruct canConstruct = new canConstruct();
        System.out.println(canConstruct.canConstruct(ransomNote, magazine));
    }
}
