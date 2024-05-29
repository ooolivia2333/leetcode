
import java.util.HashMap;

public class wordPattern {
    // 290. Word Pattern
    public boolean wordPattern(String pattern, String s) {
        HashMap map_index = new HashMap();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        for (Integer i = 0; i < pattern.length(); i++) {
            String word = words[i];
            char c = pattern.charAt(i);
            if (!map_index.containsKey(word)) {
                map_index.put(word, i);
            }
            if (!map_index.containsKey(c)) {
                map_index.put(c, i);
            }

            if (map_index.get(word) != map_index.get(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
    }
}
