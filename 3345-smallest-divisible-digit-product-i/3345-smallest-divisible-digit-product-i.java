class Solution {
    public int smallestNumber(int n, int t) {
    
       while(true){
            int num=n;
            int pro=1;

            while(num>0){
                int dig=num%10;
                pro=pro*dig;
                num=num/10;
            }
            int div=pro%t;
            if(div==0){
                return n;
            }
            n++;
        }
    }
}