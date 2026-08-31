class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int[] freq=new int[size+1];
        int r=-1;
        int m=-1;
        for(int[] row:grid){
            for(int num:row){
                freq[num]++;
            }
        }
        for(int num=1;num<=size;num++){
            if(freq[num]==2){
                r=num;
            }
            if(freq[num]==0){
                m=num;
            }
        }
        return new int[]{r,m};
    }
}