// Question 01- Kth Smallest Element in a BST
// Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the 
// values of the nodes in the tree.




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
    public int kthSmallest(TreeNode root, int k) {
        int[] count = new int[]{0};
        int[] kthSmallest = new int[]{Integer.MIN_VALUE};
        inorderHelper(root, count, k, kthSmallest);
        return kthSmallest[0];
    }

    public void inorderHelper(TreeNode root, int[] count, int k, int[] kthSmallest){
        if (root == null || count[0] >= k) return;
        // Traverse left subtree
        inorderHelper(root.left, count, k, kthSmallest);

        // Increment counter after visiting left subtree
        count[0]++;

        // Check if current node is the Kth smallest
        if (count[0] == k) {
            kthSmallest[0] = root.val;
            return;
        }

        // Traverse right subtree if Kth smallest is not found yet
        inorderHelper(root.right, count, k, kthSmallest);   
    }
}