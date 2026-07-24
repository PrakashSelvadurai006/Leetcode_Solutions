class Solution {
    public int[] replaceElements(int[] arr) {
        int a=arr.length;
        int max=-1;
        for(int i=a-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=max;
            if(temp>max){
                max=temp;
            }
        }
        return arr;
    }
}