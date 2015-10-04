
/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public boolean hasCycle(ListNode head) {
    if(head==null || head.next==null) return false;
    ListNode fastNode = head;
    ListNode slowNode = head;
    while(fastNode!=null && fastNode.next!=null)
    {
      fastNode = fastNode.next.next;
      slowNode = slowNode.next;
      if(fastNode.value == slowNode.value)
        return true;

    }
    
    return false;
  }
}
