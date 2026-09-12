class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum=0;
        int ssum=0;
        while(n>0){
            int d=n%10;
            dsum+=d;
            ssum+=d*d;
            n/=10;
        }
        if((ssum-dsum)>=50){
            return true;
        }
        return false;
    }
}