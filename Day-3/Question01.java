// Question 01-Diameter of Binary Tree

// Given the root of a binary tree, return the length of the diameter of the tree.
// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may 
// or may not pass through the root.
// The length of a path between two nodes is represented by the number of edges between them.




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
    public int diameterOfBinaryTree(TreeNode root) {
   int[] maxx=new int[1];
   maxDepth(root,maxx);
   return maxx[0];
}
private int maxDepth(TreeNode root,int[] maxx) {
   if (root == null) {
       return 0;
   }
   int leftd = maxDepth(root.left,maxx);
   int rightd = maxDepth(root.right,maxx); 
   maxx[0] = Math.max(maxx[0],leftd+rightd);
   return Math.max(leftd,rightd)+1;
}
}
