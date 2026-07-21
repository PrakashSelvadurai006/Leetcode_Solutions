class Solution {
    public int maxDepth(String s) {
        int dep=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='('){
                dep++;
                max=Math.max(max,dep);
            }else if(c==')'){
                dep--;
            }
        }
        return max;
    }
}