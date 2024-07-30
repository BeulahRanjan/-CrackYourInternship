// Question 02-Count BST nodes that lie in a given range
// Given a Binary Search Tree (BST) and a range l-h(inclusive), count the number of nodes in the BST that lie in the 
// given range.
// The values smaller than root go to the left side
// The values greater and equal to the root go to the right side





import java.util.*;;
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}
public class Question02
{
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(l<=arr.get(i) && arr.get(i)<=h) count++;
        }
        return count;
    }
    
    void inorder(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
}

