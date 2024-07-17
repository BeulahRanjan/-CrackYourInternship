// Question 08-Multiply two linked lists
// Given elements as nodes of the two singly linked lists. The task is to multiply these two linked lists, 
// say L1 and L2.
// Note: The output could be large take modulo 10^9+7.


class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}

 public class Question08 {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long largenum=1000000007;
        long num1=0;
        long num2=0;
        
        while(first!=null || second!=null)
        {
            if(first!=null)
            {
                num1=((num1*10)+first.data)%largenum;
                first=first.next;
            }
            if(second!=null)
            {
                num2=((num2*10)+second.data)%largenum;
                second=second.next;
            }
        }
        return (num1*num2)%largenum;
    }
}