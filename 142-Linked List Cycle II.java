/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
          fast = fast.next.next;
          slow = slow.next;
          if(fast == slow){
            ListNode slow2 = head;
            while(slow2!=slow){
              slow2 = slow2.next;
              slow = slow.next;
            }
            return slow;
          }
        }
        return null;
    }
}
