// Question 04- Range Sum of BST
// Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes 
// with a value in the inclusive range [low, high].




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
    int sum=0;
   public int rangeSumBST(TreeNode root, int low, int high) {
       if(root==null)
       {
           return 0;
       }
       if(root.val>=low && root.val<=high)
       sum=sum+root.val;
       rangeSumBST(root.left,low,high);
       rangeSumBST(root.right,low,high);



       return sum;
   }
}