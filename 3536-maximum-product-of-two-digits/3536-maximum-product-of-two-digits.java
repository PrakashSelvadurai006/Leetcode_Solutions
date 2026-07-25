class Solution {
    public int maxProduct(int n) {
        int a=0;
        int b=0;

        while(n>0){
            int dig=n%10;

            if(dig>a){
                b=a;
                a=dig;
            }else if(dig>b){
                b=dig;
            }
            n=n/10;
        }
        return a*b;
        
    }
}