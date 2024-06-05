import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class commonCharacters {
    public List<String> commonChars(String[] words) {
        int[] commonCounts = new int[26];
        int[] currCounts = new int[26];

        for (int i = 0; i < words[0].length(); i++) {
            commonCounts[words[0].charAt(i)-'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            String currString = words[i];
            Arrays.fill(currCounts, 0);
            for (int j = 0; j < currString.length(); j++) {
                currCounts[currString.charAt(j)-'a']++;
            }
            for (int j = 0; j < 26; j++) {
                commonCounts[j] = Math.min(commonCounts[j], currCounts[j]);
            }
        }

        List<String> ans = new ArrayList();
        for (int j = 0; j < 26; j++) {
            int repeat = commonCounts[j];
            for (int i = 0; i < repeat; i++) {
                ans.add(String.valueOf((char) ('a' + j)));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"bella", "label", "roller"};
        commonCharacters commonCharacters = new commonCharacters();
        System.out.println(commonCharacters.commonChars(words));
    }
}
