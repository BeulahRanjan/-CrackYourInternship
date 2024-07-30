// Question 03-Binary Tree to DLL
// Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. The left and right pointers in nodes 
// are to be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be 
// same as Inorder of the given Binary Tree. The first node of Inorder traversal (leftmost node in BT) must be the 
// head node of the DLL.
// Note: H is the height of the tree and this space is used implicitly for the recursion stack.




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
public class Question03
{
Node bToDLL(Node root)
    {
//  Your code here
    ArrayList<Integer> list= new ArrayList<>();
    
    getData(root,list);
    Node head=null;
    Node temp=null;
    for(int i=0;i<list.size();i++){
     Node  temp2= new Node(list.get(i));
       if(head==null){
           head=temp2;
           temp=head;
       }else{
           temp.right=temp2;
           temp2.left=temp;
           
           temp=temp2;
       }
    }
    return head;
    
    }
    void getData(Node root,ArrayList<Integer> list){
        
        if(root==null){
            return;
        }
        getData(root.left,list);
        list.add(root.data);
        getData(root.right,list);
    }
}