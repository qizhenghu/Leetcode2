/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode sortedHead = new ListNode(0);
        ListNode cur = head;
        ListNode prev = sortedHead;
        ListNode next = null;
        
        while(cur!=null){
          next = cur.next;
          while(prev.next!=null && prev.next.val < cur.val){
            prev = prev.next;
          }
          cur.next = prev.next;
          prev.next = cur;
          prev = sortedHead;
          cur = next;
        }
        return sortedHead.next;
    }
}
