// Question 06-Balanced Binary Tree
// Given a binary tree, determine if it is height-balanced





class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


public class Question06 {
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) !=-1;
    }
    int dfsHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=dfsHeight(root.left);
        if(leftHeight==-1) return -1;
        int rightHeight=dfsHeight(root.right);
        if(rightHeight==-1) return -1;

        if(Math.abs(leftHeight-rightHeight)>1) return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }
}