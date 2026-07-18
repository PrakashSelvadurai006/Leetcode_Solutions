class Solution {
    public int countAsterisks(String s) {
        int str=0;
        int bar=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'&&bar%2==0){
                str++;
            }
             if(s.charAt(i)=='|'){
                bar++;
             }
        }
        return str;
    }
}