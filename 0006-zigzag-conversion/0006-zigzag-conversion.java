class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() == 1)
            return s;
        StringBuilder sb = new StringBuilder();
        int jump = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            int j = i;
            while (j < s.length()) {
                sb.append(s.charAt(j));
                if (i != 0 && i != numRows - 1
                        && j + jump - (i * 2) < s.length()) {
                    sb.append(s.charAt(j + jump - (i * 2)));
                }
                j += jump;
            }
        }
        return sb.toString();
    }
}
