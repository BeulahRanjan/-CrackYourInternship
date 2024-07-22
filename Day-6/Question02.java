// Question 02-Maximum Depth of Binary Tree
// Given the root of a binary tree, return its maximum depth.
// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the 
// farthest leaf node.





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
 

public class Question02 {
    
    public int maxDepth(TreeNode root) {
        
        return root == null ? 0 : Math.max( maxDepth(root.left) , maxDepth( root.right )  ) + 1;
        
    }
}