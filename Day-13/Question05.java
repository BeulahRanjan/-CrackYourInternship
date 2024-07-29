// Question 05-Maximum Width of Binary Tree
// Given the root of a binary tree, return the maximum width of the given tree.
// The maximum width of a tree is the maximum width among all levels.
// The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), 
// where the null nodes between the end-nodes that would be present in a complete binary tree extending down to that 
// level are also counted into the length calculation.
// It is guaranteed that the answer will in the range of a 32-bit signed integer.



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

class Pair {
    int level;
    TreeNode root;
    public Pair(TreeNode root, int level) {
        this.level = level;
        this.root = root;
    }
    public int getLevel() {
        return level;
    }
    public TreeNode getRoot() {
        return root;
    }
}

public class Question05 {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int ans = 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            int mmin = q.peek().getLevel();

            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                int cur_id = q.peek().getLevel() - mmin;
                TreeNode node = q.peek().getRoot();
                q.poll();

                if (i == 0) {
                    first = cur_id;
                }
                if (i == size - 1) {
                    last = cur_id;
                }

                if (node.left != null) {
                    q.add(new Pair(node.left, cur_id * 2 + 1));
                }
                if (node.right != null) {
                    q.add(new Pair(node.right, cur_id * 2 + 2));
                }
            }

            ans = Math.max(ans, last - first + 1);
        }

        return ans;
    }


}
