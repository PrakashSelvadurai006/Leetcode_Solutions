class Solution {
    public int countRotations(String s,int k) {
        int n=s.length();
        int ans=0;

        for(int r=0;r<n;r++){
            int score=0;

            for(int i=0;i<n-1;i++){
                int a=(r+i)%n;
                int b=(r+i+1)%n;
                if(s.charAt(a)==s.charAt(b)){
                    score++;
                }
            }
            if(score==k){
                ans++;
            }
        }
        return ans;
    }
}