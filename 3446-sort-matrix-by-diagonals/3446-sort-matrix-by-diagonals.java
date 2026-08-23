import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        for(int r=0;r<n;r++){
            ArrayList<Integer> list=new ArrayList<>();
            int i=r,j=0;
            while(i<n && j<n){
                list.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(list,Collections.reverseOrder());
            i=r;
            j=0;
            int k=0;
            while(i<n && j<n){
                grid[i][j]=list.get(k++);
                i++;
                j++;
            }
        }
        for(int c=1;c<n;c++){
            ArrayList<Integer> list=new ArrayList<>();
            int i=0,j=c;
            while(i<n && j<n){
                list.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(list);
            i=0;
            j=c;
            int k=0;
            while(i<n && j<n){
                grid[i][j]=list.get(k++);
                i++;
                j++;
            }
        }
        return grid;
    }
}