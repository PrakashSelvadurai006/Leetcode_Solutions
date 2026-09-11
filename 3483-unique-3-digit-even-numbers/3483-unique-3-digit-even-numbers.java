class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;

        for (int num = 100; num <= 998; num += 2) {
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            int[] freq = new int[10];

            for (int i = 0; i < digits.length; i++) {
                freq[digits[i]]++;
            }

            if (freq[a] > 0) {
                freq[a]--;

                if (freq[b] > 0) {
                    freq[b]--;

                    if (freq[c] > 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}