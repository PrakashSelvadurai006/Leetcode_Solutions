class Solution {
    public int missingMultiple(int[] nums, int k) {
        int mul=k;
        while(true){
            boolean find=false;

            for(int n:nums){
                if(n==mul){
                    find=true;
                }
            }
            if(!find){
                return mul;
            }
            mul+=k;
        }
    }
}