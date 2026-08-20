class Solution {
    public int addedInteger(int[] num1, int[] num2) {
        int a=num1[0];
        int b=num2[0];

        for(int i=1;i<num1.length;i++){
            a=Math.min(a,num1[i]);
            b=Math.min(b,num2[i]);
        }
        return b-a;
    }
}