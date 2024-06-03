public class appendString {
    public int appendCharacters(String s, String t) {
        int index1 = 0, index2 = 0;
        while (index1 < s.length() && index2 < t.length()) {
            if (s.charAt(index1) == t.charAt(index2)) index2++;
            index1++;
        }
        return t.length() - index2;
    }

    public static void main(String[] args) {
        String s = "z", t = "abcde";
        appendString appendString = new appendString();
        System.out.println(appendString.appendCharacters(s, t));
    }
}
