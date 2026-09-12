class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n=s.length()-1;
        for(int i=0;i<n;i++){
            int a=s.charAt(i)-'0';
            int b=s.charAt(i+1)-'0';
            if(Math.abs(a-b)>2){
                return false;
            }
        }
        return true;
    }
}