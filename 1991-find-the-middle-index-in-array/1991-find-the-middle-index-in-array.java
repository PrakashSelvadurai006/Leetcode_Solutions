class Solution {
    public int findMiddleIndex(int[] nums) {
        int tot=0;
        for(int n:nums){
            tot+=n;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            tot-=nums[i];
            if(tot==sum){
                return i;
            }
            sum+=nums[i];
        }
        return -1;
    }
}