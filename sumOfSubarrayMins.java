import java.util.Stack;

public class sumOfSubarrayMins {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int MOD = 1000000007;
        int ans = 0;

        for (int i = 0; i <= arr.length; i++) {
            while (!stack.isEmpty() && (i == arr.length || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int right = i;
                int left = stack.isEmpty()? -1: stack.peek();

                int contribution = arr[mid] * (right - mid) * (mid - left) % MOD;
                ans = (ans + contribution) % MOD;
            }
            stack.push(i);
        }
        return ans;
    }
}
