class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minprice=Integer.MAX_VALUE;
        int profit=0;

        for(int i=0;i<n;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }else{
                profit=Math.max(profit,prices[i]-minprice);
            }
        }
        return profit;
    }
}