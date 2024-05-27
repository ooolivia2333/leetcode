
import java.util.HashSet;
import java.util.Set;

public class PerfectSquares {
    //279. Perfect Squares
    static Set<Integer> set = new HashSet();

    private static boolean isDivisible(int n, int count) {
        if (count == 1) return set.contains(n);
        for (int square: set) {
            if (isDivisible(n-square, count-1)) return true;
        }
        return false;
    }

    public static int numSquares(int n) {
        for (int i = 1; i*i <= n; i++) set.add(i*i);
        int count = 1;
        for (; count <= n; count++) {
            if (isDivisible(n, count)) return count;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(numSquares(n));
    }
}
