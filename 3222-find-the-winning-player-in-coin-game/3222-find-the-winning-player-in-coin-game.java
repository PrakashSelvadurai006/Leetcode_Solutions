class Solution {
    public String winningPlayer(int x, int y) {
        int t=Math.min(x,y/4);
        if(t%2==1){
            return "Alice";
        }
        return "Bob";
    }
}