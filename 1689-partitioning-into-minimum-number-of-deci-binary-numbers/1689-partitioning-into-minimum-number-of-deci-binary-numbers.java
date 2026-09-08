class Solution {
    public int minPartitions(String n) {
        int dig=0;
        for(char ch:n.toCharArray()){
            dig=Math.max(dig,ch-'0');
        }
        return dig;
    }
}