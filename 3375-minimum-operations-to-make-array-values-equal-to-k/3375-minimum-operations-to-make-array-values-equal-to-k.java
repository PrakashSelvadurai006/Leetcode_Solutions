class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count =0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]<k)
                return -1;
            if (nums[i]>k && (i==0||nums[i]!=nums[i-1]))
                count++;
        }
        return count;
    }
}