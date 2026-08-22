class Solution {
    public boolean checkDivisibility(int n) {
        int  sum=0;
        int  pro=1;
        int temp=n;

        while(n>0){
            int dig=n%10;
            sum=sum+dig;
            pro=pro*dig;
            n=n/10;
        }
        int tot=sum+pro;
        return temp%tot==0;
    }
}