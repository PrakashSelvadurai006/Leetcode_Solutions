class Solution{
    public int maxHeightOfTriangle(int red,int blue){
        int ans=0;

        for(int i=1;i<=100;i++){
            int odd=(i+1)/2;
            int even=i/2;

            int r=odd*(odd);
            int b=even*(even+1);

            if(red>=r&&blue>=b){
                ans=i;
            }
            if(blue>=r&&red>=b){
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}