// Question 01 - Predecessor and Successor
// There is BST given with the root node with the key part as an integer only. You need to find the in-order successor 
// and predecessor of a given key. If either predecessor or successor is not found, then set it to NULL.
// Note:- In an inorder traversal the number just smaller than the target is the predecessor and the number just 
// greater than the target is the successor. 





class Node {
    int key;
    Node left, right;
    
    public Node(int item) {
        key = item;
        left = right = null;
    }
}
public class Question01 {
    public void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        pre[0] = null;
        suc[0] = null;
        
        Node node = root;
        while (node != null) {
            if (node.key <= key) {
                node = node.right;
            } else {
                suc[0] = node;
                node = node.left;
            }
        }
        
        node = root;
        while (node != null) {
            if (key > node.key) {
                pre[0] = node;
                node = node.right;
            } else {
                node = node.left;
            }
        }
    }
}


