// Question 02 - heck whether BST contains Dead End
// Given a Binary Search Tree that contains unique positive integer values greater than 0. The task is to complete 
// the function isDeadEnd which returns true if the BST contains a dead end else returns false. Here Dead End means 
// a leaf node, at which no other node can be inserted.




class Node {
        int data;
        Node left, right;
 
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
public class Question02
{
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        return solve(root, 1, Integer.MAX_VALUE);
    }
    public static boolean solve(Node root, int min, int max){
        if(root==null){
            return false;
        }
        if(min==max){
            return true;
        }
        return solve(root.left, min, root.data-1) || solve(root.right, root.data+1, max);
    }
}