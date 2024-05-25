public class RedistributeCharacters {
    public static boolean makeEqual(String[] words) {
        int n = words.length;
        int[] count = new int[26];
        for (String word: words) {
            for (int i = 0; i < word.length(); i++) count[word.charAt(i)-'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] % n != 0) return false;
        }

        return true;
    }

    // 1897. Redistribute Characters to Make All Strings Equal
    public static void main(String[] args) {
        String[] words = new String[]{"caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c"};
        System.out.println(makeEqual(words));
    }
}
