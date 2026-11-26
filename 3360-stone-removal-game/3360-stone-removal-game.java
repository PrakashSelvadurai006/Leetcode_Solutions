class Solution {
    public boolean canAliceWin(int n) {
        int r=10;
        while(n>=r){
            n=n-r;
            r--;

            if(r==0){
                break;
            }
        }
        return r%2==1;
    }
}