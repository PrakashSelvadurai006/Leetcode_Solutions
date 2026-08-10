class Solution {
    public int[] decimalRepresentation(int n) {
        int temp = n;
        int count = 0;

        while (temp > 0) {
            if (temp % 10 != 0) {
                count++;
            }
            temp /= 10;
        }
        int[] ans = new int[count];
        int place = 1;
        int index = count - 1;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                ans[index--] = digit * place;
            }
            n /= 10;
            place *= 10;
        }
        return ans;
    }
}