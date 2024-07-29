// Question 06-Min distance between two given nodes of a Binary Tree
// Given a binary tree with n nodes and two node values, a and b, your task is to find the minimum distance between 
// them. The given two nodes are guaranteed to be in the binary tree and all node values are unique.




class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} 

/* Should return minimum distance between a and b
   in a tree with given root*/
public class Question06 {
        // Your code here
    // Should return minimum distance between a and b in a tree with given root
    int ans = 0;

    int f(Node root, int a, int b, int i) {
        if (root == null) return 0;
        int l = f(root.left, a, b, i + 1);
        int r = f(root.right, a, b, i + 1);

        if ((root.data == a || root.data == b) && (l != 0 || r != 0)) {
            ans = Math.abs(Math.max(l, r) - i);
            return Math.max(l, r) - i;
        }
        if (l != 0 && r != 0) {
            ans = Math.abs(l + r - 2 * i);
            return ans;
        }
        if (Math.max(l, r) != 0) return Math.max(l, r);

        if (root.data == a) return i;
        else if (root.data == b) return i;
        else return 0;
    }

    int findDist(Node root, int a, int b) {
        f(root, a, b, 0);
        return ans;
    }
        }
