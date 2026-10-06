class Solution {
    public int elevatorRequests(int n, int[] requests) {
        
        int t=0;
        int cur=0;
        for (int f:requests) {
            t+=Math.abs(f-cur);
            cur=f;
        }
        return t;
    }
}