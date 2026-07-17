class Solution {
    public int[] twoSum(int[] a, int target) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
               int sum = a[i] + a[j];
                if(sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}