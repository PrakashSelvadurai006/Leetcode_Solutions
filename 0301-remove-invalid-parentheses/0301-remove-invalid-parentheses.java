import java.util.*;

class Solution{
    public List<String> removeInvalidParentheses(String s){
        List<String> result=new ArrayList<>();
        Set<String> visited=new HashSet<>();
        Queue<String> q=new LinkedList<>();
        q.add(s);
        visited.add(s);
        boolean found=false;

        while(!q.isEmpty()){
            String cur=q.poll();

            if(isValid(cur)){
                result.add(cur);
                found=true;
            }

            if(found)continue;

            for(int i=0;i<cur.length();i++){
                if(cur.charAt(i)!='('&&cur.charAt(i)!=')')continue;

                String next=cur.substring(0,i)+cur.substring(i+1);

                if(!visited.contains(next)){
                    q.add(next);
                    visited.add(next);
                }
            }
        }

        return result;
    }

    public boolean isValid(String s){
        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')count++;
            else if(s.charAt(i)==')'){
                count--;
                if(count<0)return false;
            }
        }

        return count==0;
    }
}