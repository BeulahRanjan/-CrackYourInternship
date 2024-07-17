// Question 06-203. Remove Linked List Elements
// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has 
// Node.val == val, and return the new head.

 


  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public class Question06 {
    public ListNode removeElements(ListNode head, int val) {
    ListNode temp = new ListNode(0) , curr = temp;
        temp.next = head;
        while(curr.next != null ){
            if(curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return temp.next;
    }
}