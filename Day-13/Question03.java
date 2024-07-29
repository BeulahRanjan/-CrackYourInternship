// Question 03-Recover Binary Search Tree
// You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were 
// swapped by mistake. Recover the tree without changing its structure.




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
    TreeNode prev=null,first=null,second=null;
    void inorder(TreeNode root){
        if(root==null)
            return ;
        inorder(root.left);
        if(prev!=null&&root.val<prev.val){
            if(first==null)
                first=prev;
            second=root;
        }
        prev=root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        if(root==null)
            return ; 
        inorder(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
}