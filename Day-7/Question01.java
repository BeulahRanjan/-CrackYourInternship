// Question 01- Minimum Absolute Difference in BST
// Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any 
// two different nodes in the tree.




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
 
public class Question01 {
    int minDifference = Integer.MAX_VALUE;
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        
        //Exit Condition
        if(root == null) return minDifference;

        getMinimumDifference(root.left);

        //Process Root
        if(prev != null){
            minDifference = Math.min(minDifference, root.val-prev);
        }

        if(root != null){
            prev = root.val;
        }

        getMinimumDifference(root.right);

        return minDifference;
    }
}
