// Question 11-Add Two Numbers II
// You are given two non-empty linked lists representing two non-negative integers. The most significant digit 
// comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a 
// linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.


  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

   public class Question11 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead= new ListNode(-1);
        ListNode curr=dummyHead;
        l1=reverseList(l1);
        l2=reverseList(l2);
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        while(temp1!=null || temp2!=null)
        {
            int sum=carry;
            if(temp1!=null)
            {
                sum+=temp1.val;
            }
            if(temp2!=null)
            {
                sum+=temp2.val;
            }
            ListNode newNode=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newNode;
            curr=curr.next;
            if(temp1!=null)
            {
                temp1=temp1.next;
            }
            if(temp2!=null)
            {
                temp2=temp2.next;
            }
        }
            if(carry>0)
            {
                ListNode newNode=new ListNode(carry);
                curr.next=newNode;
            }
        return reverseList(dummyHead.next);
    }

     ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}