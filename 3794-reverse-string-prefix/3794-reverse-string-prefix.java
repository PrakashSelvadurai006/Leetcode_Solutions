class Solution {
    public String reversePrefix(String s, int k) {
        char[] a=s.toCharArray();
        int l=0;
        int r=k-1;
        while(l<r){
            char temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        return new String(a);
    }
}