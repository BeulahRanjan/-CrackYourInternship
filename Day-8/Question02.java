// Question 02- Flatten Binary Tree to Linked List
// Given the root of a binary tree, flatten the tree into a "linked list":
// The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the 
// list and the left child pointer is always null.
// The "linked list" should be in the same order as a pre-order traversal of the binary tree.





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
 
class Question02 {
    public void flatten(TreeNode root) {
         if (root == null) return;
         
         TreeNode left = root.left;
         TreeNode right = root.right;
         
         root.left = null;
         
         flatten(left);
         flatten(right);
         
         root.right = left;
         TreeNode cur = root;
         while (cur.right != null) cur = cur.right;
         cur.right = right;
     }
 }