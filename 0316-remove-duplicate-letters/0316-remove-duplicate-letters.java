class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] used = new boolean[26];

        for (char ch : s.toCharArray())
            count[ch - 'a']++;

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            count[ch - 'a']--;

            if (used[ch - 'a'])
                continue;

            while (!st.isEmpty() &&
                   st.peek() > ch &&
                   count[st.peek() - 'a'] > 0) {
                used[st.pop() - 'a'] = false;
            }

            st.push(ch);
            used[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();
        for (char ch : st)
            ans.append(ch);

        return ans.toString();
    }
}