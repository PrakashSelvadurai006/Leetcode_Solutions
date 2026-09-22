class Solution {
    public int maxDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        int leftD=maxDepth(root.left);
        int rightD=maxDepth(root.right);
        
        return 1+Math.max(leftD,rightD);
    }
}