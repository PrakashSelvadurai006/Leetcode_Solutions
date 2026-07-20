class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int pre=0;
        for(int n:nums){
            if(n!=0&&n!=pre){
                count++;
                pre=n;
            }
        }
        return count;
    }
}