class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        String a="";
        for(int i=0;i<n-2;i++){
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i+2)){
                String t=num.substring(i,i+3);
                if(a.equals("")||t.compareTo(a)>0){
                    a=t;
                }
            }
        }
        return a;
    }
}