class Solution {
    public String kthDistinct(String[] arr, int k) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
            boolean d=true;
            for(int j=0;j<arr.length;j++) {
                if(i!=j&&arr[i].equals(arr[j])) {
                    d=false;
                    break;
                }
            }
            if(d) {
                count++;
                if(count==k)
                    return arr[i];
            }
        }
        return "";
    }
}