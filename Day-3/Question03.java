// Question 03-Subtree of Another Tree
// Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same 
// structure and node values of subRoot and false otherwise.
// A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. 
// The tree tree could also be considered as a subtree of itself.





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

public class Question03 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if (root == null) return false;
      if (dfs(root, subRoot)) return true;
      return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean dfs(TreeNode root, TreeNode subRoot) {
      if (root == null && subRoot == null) return true;
      if (root == null || subRoot == null) return false;
      if (root.val != subRoot.val) return false;
      return dfs(root.left, subRoot.left) && dfs(root.right, subRoot.right);
    }
  }
  
  