/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return head;
        
        RandomListNode cur = head;
        while(cur!=null){
          RandomListNode next = cur.next;
          cur.next = new RandomListNode(cur.label);
          cur.next.next = next;
          cur = next;
        }
        
        cur = head;
        while(cur!=null){
          RandomListNode random = cur.random;
          if(random!=null){
            cur.next.random = random.next;
          }      
          cur = cur.next.next;
        }
        
        RandomListNode copyHead = head.next;
        cur = head;
        RandomListNode copyCur = copyHead;
        while(cur.next!=null){
          cur.next = cur.next.next;
          cur = cur.next;
          
          copyCur.next = copyCur.next.next;
          copyCur = copyCur.next;
        }
        
        cur.next = cur.next.next;
        return copyHead;
    }
}
