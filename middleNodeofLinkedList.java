
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
  public ListNode middleNode(ListNode head) {
    if(head==null || head.next == null) return head;
    ListNode fastNode = head;
    ListNode slowNode = head;
    while(fastNode.next!=null && fastNode.next.next!=null)
    {
      fastNode = fastNode.next.next;
      slowNode = slowNode.next;
    }
    return slowNode;
  }
}
