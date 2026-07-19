class Solution {
    public int fillCups(int[] amt) {
        int sum=amt[0]+amt[1]+amt[2];
        int max=Math.max(amt[0],Math.max(amt[1],amt[2]));
        return Math.max(max,(sum+1)/2);
        
    }
}