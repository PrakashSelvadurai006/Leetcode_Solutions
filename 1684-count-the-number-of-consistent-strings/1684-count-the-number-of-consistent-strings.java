class Solution{
    public int countConsistentStrings(String allowed,String[] words){
        boolean[] a=new boolean[26];
        for(int i=0;i<allowed.length();i++){
            a[allowed.charAt(i)-'a']=true;
        }
        int count=0;
        for(int i=0;i<words.length;i++){
            boolean valid=true;
            for(int j=0;j<words[i].length();j++){
                char c=words[i].charAt(j);
                if(!a[c-'a']){
                    valid=false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count;
    }
}