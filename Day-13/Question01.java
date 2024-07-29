// Question 01-Construct Binary Tree from Preorder and Postorder Traversal
// Given two integer arrays, preorder and postorder where preorder is the preorder traversal of a binary tree of 
// distinct values and postorder is the postorder traversal of the same tree, reconstruct and return the binary tree.
// If there exist multiple answers, you can return any of them.



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
 

 public class Question01 {
    public TreeNode construct(int[] pre, int preStart, int preEnd, int[] post, int postStart, int postEnd, HashMap<Integer, Integer> map) {
        if(preStart > preEnd) return null;
        TreeNode root = new TreeNode(pre[preStart]);
        if(preStart == preEnd) return root;  // when there is only one node in left or right subtree
        int postIdx = postStart;
        
        postIdx = map.get(pre[preStart+1]); 
        
        int len = postIdx-postStart +1;
        root.left = construct(pre, preStart+1, preStart+len, post, postStart, postIdx, map);
        root.right = construct(pre, preStart+len+1, preEnd, post, postIdx+1, postEnd-1, map);
        return root;
    }

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = postorder.length;
        for(int i = 0; i < n; i++) {
            map.put(postorder[i], i);  // indx, value
        }

        return construct(preorder, 0, n-1, postorder, 0, n-1, map);
    }
}