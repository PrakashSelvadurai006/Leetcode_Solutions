class Solution {
    public String mergeAlternately(String w1, String w2) {
        String a="";
        int i=0;
        int j=0;

        while(i<w1.length()||j<w2.length()){
            if(i<w1.length()){
                a=a+w1.charAt(i++);
            }
            if(j<w2.length()){
                a=a+w2.charAt(j++);
            }
        }
        return a;
    }
}