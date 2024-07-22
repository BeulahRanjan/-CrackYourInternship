// Question 07-Binary Tree Inorder Traversal
// Given the root of a binary tree, return the inorder traversal of its nodes' values.





import java.util.*;
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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        traverse(root, a);
        return a;
    }

    void traverse(TreeNode node, ArrayList<Integer> a )
    {
        if(node==null)
        {
            return;
        }
        traverse(node.left, a);
        a.add(node.val);
        traverse(node.right, a);
    }
}