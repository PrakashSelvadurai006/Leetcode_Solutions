class Solution {
public int minRotations(String s) {
    int cur=0;
    int result=0;

    for(char c:s.toCharArray()){
        int digit=c-'0';
        int d=(digit-cur+10)%10;
        result+=Math.min(d,10-d);
        cur=digit;
        }
        return result;
    }
}