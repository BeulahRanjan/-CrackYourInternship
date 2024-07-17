// Question 05-Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only.
// The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end 
//  of the linked list, and 1s in the mid of 0s and 2s.

  

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class Question05 {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        
    if(head==null || head.next== null)
    {
        return head;
    }
    Node zerohead= new Node(-1);
    Node onehead= new Node(-1);
    Node twohead= new Node(-1);
    
    Node zero=zerohead;
    Node one=onehead;
    Node two=twohead;
    Node temp=head;
    
    while(temp!=null)
    {
        if(temp.data==0)
        {
            zero.next=temp;
            zero=zero.next;
        }
        else
        if(temp.data==1)
        {
            one.next=temp;
            one=one.next;
        }
        else
        if(temp.data==2)
        {
            two.next=temp;
            two=two.next;
        }
        temp=temp.next;
    }
    
    zero.next=(onehead.next!=null)?onehead.next:twohead.next;
    one.next=twohead.next;
    two.next=null;
    
    Node newhead=zerohead.next;
    
    return newhead;
    }
}
