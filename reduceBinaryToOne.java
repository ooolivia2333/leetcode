public class reduceBinaryToOne {
    // 1404. Number of Steps to Reduce a Number in Binary Representation to One
    public int numSteps(String s) {
        StringBuilder sb = new StringBuilder(s);
        int step = 0;
        while (!sb.toString().equals("1")) {
            if (sb.charAt(sb.length()-1) == '1') addOne(sb);
            else divideByTwo(sb);
            step++;
        }

        return step;
    }

    private void divideByTwo(StringBuilder sb) {
        sb.deleteCharAt(sb.length()-1);
    }

    private void addOne(StringBuilder sb) {
        int i = sb.length()-1;
        while (i >= 0 && sb.charAt(i) == '1') {
            sb.setCharAt(i, '0');
            i--;
        }
        if (i < 0) sb.insert(0, '1');
        else sb.setCharAt(i, '1');
    }

    public static void main(String[] args) {
        String s = "1101";
        reduceBinaryToOne reduceBinaryToOne = new reduceBinaryToOne();
        System.out.println(reduceBinaryToOne.numSteps(s));
    }
}
