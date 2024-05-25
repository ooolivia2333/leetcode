import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class WordBreakII {
    private static List<String> ans;
    private static Set<String> words;
    private static void backtrack(String s, int index, List<String> curr) {
        if (index == s.length()) {
            StringBuilder sb = new StringBuilder();
            for (String str: curr) {
                sb.append(str);
                sb.append(" ");
            }
            ans.add(sb.toString().trim());
            return;
        }

        for (int end = index+ 1; end <= Math.min(index+11, s.length()); end++) {
            if (words.contains(s.substring(index, end))) {
                //System.out.println(s.substring(index, end));
                curr.add(s.substring(index, end));
                backtrack(s, end, curr);
                curr.remove(curr.size()-1);
            }
        }
    }

    public static List<String> wordBreak(String s, List<String> wordDict) {
        ans = new ArrayList();
        words = new HashSet();
        
        for (String word: wordDict) {
            words.add(word);
        }

        backtrack(s, 0, new ArrayList());

        return ans;
    }

    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>(List.of("cat","cats","and","sand","dog"));
        List<String> ans = wordBreak(s, wordDict);
        for (String str: ans) {
            System.out.println(str);
        }
    }
}
