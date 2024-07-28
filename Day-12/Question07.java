// Question 07 - Path Sum III
// Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values 
// along the path equals targetSum.
// The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only 
// from parent nodes to child nodes).





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
 
public class Question07 {
    int total = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        helper(root, sum, 0);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return total;
    }

    void helper(TreeNode root, int sum, long curr) {
        if(root == null) return;
        curr += root.val;
        if(curr == sum) total++;
        helper(root.left, sum, curr);
        helper(root.right, sum, curr);
    }
}