class Solution {
    public int findSpecialInteger(int[] arr) {
        int a=arr.length;
        int r=a/4;
        for(int i=0;i<a-r;i++){
            if(arr[i]==arr[i+r]){
                return arr[i];
            }
        }
        return -1;
    }
}