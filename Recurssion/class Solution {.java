class Solution {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            System.out.print(digits);
            digits[i] = 0;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;

    }

    public static void main(String[] args) {
        int[] n = { 1, 2, 3 };
       // plusOne(n);
         System.out.println(plusOne(n));

    }
}