
import java.util.ArrayList;
import java.util.List;



public class minStringAfterRemoveStars {
    List<List<Integer>> freqCount = new ArrayList();
    boolean[] removed;

    public String clearStars(String s) {
        int prev = 0;
        int index = 0;
        removed = new boolean[s.length()];
        for (int i = 0; i < 26; i++) {
            freqCount.add(new ArrayList<>());
        }
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) != '*') continue;
            index = j;
            for (int i = prev; i < index; i++) {
                freqCount.get(s.charAt(i)-'a').add(i);
            }
            for (int i = 0; i < 26; i++) {
                if (!freqCount.get(i).isEmpty()) {
                    int smallestIndex = freqCount.get(i).get(freqCount.get(i).size()-1);
                    freqCount.get(i).remove(freqCount.get(i).size()-1);
                    removed[smallestIndex] = true;
                    break;
                }
            }
            prev = index+1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!removed[i] && s.charAt(i) != '*') sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ccbcb**";
        minStringAfterRemoveStars minStringAfterRemoveStars = new minStringAfterRemoveStars();
        System.out.println(minStringAfterRemoveStars.clearStars(s));
    }
}
