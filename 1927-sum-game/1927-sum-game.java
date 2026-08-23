class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int mid=n/2;
        int sum=0;
        int q=0;

        for(int i=0;i<n;i++) {
            if(num.charAt(i)=='?') {
                if(i<mid) {
                    q++;
                } else {
                    q--;
                }
            } else {
                if(i<mid) {
                    sum+=num.charAt(i)-'0';
                } else {
                    sum-=num.charAt(i)-'0';
                }
            }
        }
        if(Math.abs(q)%2!=0) {
            return true;
        }
        return sum*2!=-q*9;
    }
}