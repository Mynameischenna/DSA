//package Testing;
///**
// * Definition for singly-linked list.
// * class ListNode {
// *     public int val;
// *     public ListNode next;
// *     ListNode(int x) { val = x; next = null; }
// * }
// */
//public class ds {
//    public ListNode addTwoNumbers(ListNode A, ListNode B) {
//        ListNode temp = A;
//        int l1 = 0;
//        while(temp != null){
//            l1 = l1*10 + temp.val;
//            temp = temp.next;
//        }
//        temp = B;
//        int l2 = 0;
//        while(temp != null){
//            l2 = l2*10 + temp.val;
//            temp = temp.next;
//        }
//        int ans = l1+l2;
//        ListNode dummy = new ListNode(0);
//        temp = dummy;
//        while(ans != 0){
//            int d = ans % 10;
//            temp.next = new ListNode(d);
//            ans = ans/10;
//
//        }
//        return dummy.next;
//    }
//}
