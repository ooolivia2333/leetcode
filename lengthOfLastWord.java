public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }

    public static void main(String[] args) {
        lengthOfLastWord lengthOfLastWord = new lengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
    }
}
