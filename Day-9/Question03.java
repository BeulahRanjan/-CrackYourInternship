// Question 03-Sort List
// Given the head of a linked list, return the list after sorting it in ascending order.

 



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Question03 {
    // Function to find the middle of the linked list
    private ListNode findMiddle(ListNode head) {
        if (head == null) return null;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        // Use two pointers to find the middle of the list
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }

    // Function to merge two sorted linked lists
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        
        // Attach the remaining elements, if any
        temp.next = (list1 != null) ? list1 : list2;
        
        return dummyNode.next;
    }

    // Main function to sort the linked list using merge sort
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        // Find the middle of the linked list
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;
        
        // Recursively split and merge
        ListNode left = sortList(head);
        right = sortList(right);
        
        return mergeTwoLists(left, right);
    }
}