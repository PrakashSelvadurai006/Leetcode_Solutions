class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";

        for(int i = 0; i < words.length; i++) {
            for(int j = words[i].length() - 1; j >= 0; j--) {
                result += words[i].charAt(j);
            }

            if(i < words.length - 1) {
                result += " ";
            }
        }

        return result;
    }
}