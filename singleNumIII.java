

public class singleNumIII {
    // 260. Single Number III
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num: nums) xor ^= num;
        int mask = 1;
        while ((xor & mask) == 0) mask = mask << 1;

        int num1 = 0, num2 = 0;
        for (int num: nums) {
            if ((num & mask) == 0) num1 ^= num;
            else num2 ^= num;
        }

        return new int[]{num1, num2};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        singleNumIII singleNumIII = new singleNumIII();
        int[] ans = singleNumIII.singleNumber(nums);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
