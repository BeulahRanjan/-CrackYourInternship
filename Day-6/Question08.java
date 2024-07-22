// Question 08- Binary Tree Right Side View
// Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the 
// nodes you can see ordered from top to bottom.




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
 
public class Question08 {
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> arr = new ArrayList<>();
       func(0,arr,root);
       return arr;
   }

   public void func(int level, List<Integer> arr, TreeNode root){
       if(root == null) return;
       if (level == arr.size()) arr.add(root.val);
       func(level+1,arr,root.right);
       func(level+1,arr,root.left);
   }
}