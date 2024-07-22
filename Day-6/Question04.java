// Question 04- Same Tree
// Given the roots of two binary trees p and q, write a function to check if they are the same or not.
// Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.







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
 
public class Question04 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return (p==q);
        }
        
        return ( p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
 
    }
}