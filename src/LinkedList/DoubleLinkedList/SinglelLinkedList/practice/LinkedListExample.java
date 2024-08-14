package LinkedList.DoubleLinkedList.SinglelLinkedList.practice;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LinkedListExample {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.println("Original list:");
        printList(head);

        modifyList(head);

        System.out.println("Modified list:");
        printList(head);
    }

    public static void modifyList(ListNode head) {
        if (head != null) {
            head.val = 99; // Modify the value of the first node
            if (head.next != null) {
                head.next = head.next.next; // Remove the second node
            }
        }
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
