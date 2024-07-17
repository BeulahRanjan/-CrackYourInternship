// Question 10- Delete nodes having greater value on right
// Given a singly linked list, remove all the nodes in the list which have any node on their right whose value is
// greater. (Not just immediate Right , but entire List on the Right)




class Node {
    int data;
    Node next;
 
   Node(int data) {
       this.data = data;
   }
 }

 public class Question10 {
     Node compute(Node head) {
         // Reverse the list
         head = reverseList(head);
 
         Node maxNode = head;
         Node curr = head;
 
         while (curr != null && curr.next != null) {
             if (curr.next.data < maxNode.data) {
                 curr.next = curr.next.next; // Remove the node
             } else {
                 curr = curr.next;
                 maxNode = curr; // Update the maxNode
             }
         }
 
         // Reverse the list again to restore original order
         return reverseList(head);
     }
 
     Node reverseList(Node head) {
         Node prev = null;
         Node curr = head;
 
         while (curr != null) {
             Node next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }
 
         return prev;
     }
 }
 