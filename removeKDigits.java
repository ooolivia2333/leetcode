import java.util.Stack;

public class removeKDigits {
    public String removeKdigits(String num, int k) {
        if (k >= num.length()) return "0";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && stack.peek() > num.charAt(i) && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (char c: stack) {
            if (leadingZero && c == '0') continue;
            leadingZero = false;
            sb.append(String.valueOf(c));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        removeKDigits removeKDigits = new removeKDigits();
        System.out.println(removeKDigits.removeKdigits("1432219", 3));
    }
}
