/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode even = evenHead;
        while(even!=null && even.next!=null){
          oddHead.next = even.next;
          oddHead = oddHead.next;
          even.next = oddHead.next;
          even = even.next;
        }
        oddHead.next = evenHead;
        return head;
    }
}
