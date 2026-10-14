
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }

        char[] ans = new char[num];

        for (int i = 0; i < num; i++) {
            if (sum >= 9) {
                ans[i] = '9';
                sum -= 9;
            } else {
                ans[i] = (char) ('0' + sum);
                sum = 0;
            }
        }

        return new String(ans);
    }
}
