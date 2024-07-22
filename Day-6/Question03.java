// Question 03- Binary Tree Paths
// Given the root of a binary tree, return all root-to-leaf paths in any order.
// A leaf is a node with no children.







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

public class Question03 {
    public List<String> binaryTreePaths(TreeNode root) {
     List<String> answer = new ArrayList<String>();
     if (root != null) searchBT(root, "", answer);
     return answer;
 }
 private void searchBT(TreeNode root, String path, List<String> answer) {
     if (root.left == null && root.right == null) answer.add(path + root.val);
     if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
     if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
 }
 }