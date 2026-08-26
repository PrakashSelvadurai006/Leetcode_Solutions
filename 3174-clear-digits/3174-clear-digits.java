class Solution{
    public String clearDigits(String s){
        char[] a=new char[s.length()];
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                a[k]=s.charAt(i);
                k++;
            }else{
                k--;
            }
        }
        String result="";
        for(int i=0;i<k;i++){
            result+=a[i];
        }
        return result;
    }
}