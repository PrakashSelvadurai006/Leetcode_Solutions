class Solution {
    public String truncateSentence(String s, int k) {
        String[] w=s.split(" ");
        String ans="";
        for(int i=0;i<k;i++){
            if(i>0){
            ans+=" ";
        }
        ans+=w[i];
        }
        return ans;
    }
}