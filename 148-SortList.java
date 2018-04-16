/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode slow = head, fast = head, prev = null;
        while(fast! == null || fast.next!=null){
          prev = slow;
          slow = slow.next;
          fast = fast.next.next;
        }
        prev.next = null;
        ListNode l1 = sortList(head);
        Listnode l2 = sortList(slow);
        
        return merge(l1, l2);
    }
    
    private ListNode merge(ListNode l1, ListnNode l2){
        ListNode l = new ListNode(0);
        ListNode head = l;
        while(l1!=null && l2!=null){
          if(l1.val > l2.val){
            l.next = l2;
            l2 = l2.next;
          }else{
            l.next = l1;
            l1 = l1.next;
          }
        }
        if(l1!=null){
          l.next = l1;
        }
        if(l2!=null){
          l.next = l2;
        }
        return head.next;
    }
}
