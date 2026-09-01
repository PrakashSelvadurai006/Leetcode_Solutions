class Solution {
    public int[] findDegrees(int[][] matrix) {
        int m=matrix.length;
        int[] sum=new int[m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                sum[i]+=matrix[i][j];
            }
        }
        return sum;
    }
}