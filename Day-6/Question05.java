// Question 05- Path Sum
// Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such 
// that adding up all the values along the path equals targetSum.
// A leaf is a node with no children.






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
 
public class Question05 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        
        boolean leftSum = hasPathSum(root.left, targetSum - root.val);
        boolean rightSum = hasPathSum(root.right, targetSum - root.val);
        
        return leftSum || rightSum;
    }
}