// Question 09- Intersection of Two Linked Lists

// Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
// If the two linked lists have no intersection at all, return null.
// The test cases are generated such that there are no cycles anywhere in the entire linked structure.
// Note that the linked lists must retain their original structure after the function returns.

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


 
 public class Question09 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
        {
            return null;
        }
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;

            if(temp1==temp2)
            {
                return temp1;
            }

            if(temp1==null)
            {
                temp1=headB;
            }
            else
            if(temp2==null)
            {
                temp2=headA;
            }
        }
        return temp1;
    }
}