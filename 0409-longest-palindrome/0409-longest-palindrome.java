class Solution {
    public int longestPalindrome(String s) {
        boolean[] seen = new boolean[128];
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (seen[ch]) {
                length += 2;
                seen[ch] = false;
            } else {
                seen[ch] = true;
            }
        }
        for (int i = 0; i < 128; i++) {
            if (seen[i]) {
                length++;
                break;
            }
        }
        return length;
    }
}