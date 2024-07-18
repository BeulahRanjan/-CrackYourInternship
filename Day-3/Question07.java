// Question 07-Palindrome Linked List
// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.





 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class Question07 {
    ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
        return head;
        ListNode newHead=reverse(head.next);
        ListNode front= head.next;
        front.next=head;
        head.next=null;
        return newHead;

    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        return true;
        ListNode slow= head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode first = head;
        ListNode second = newHead;
        while(second!=null)
        {
            if(first.val!=second.val)
            {
                reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newHead);
        return true;    
    }
}