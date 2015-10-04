
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
  public ListNode insert(ListNode head, int value) {
    if(head == null) return new ListNode(value);
    ListNode newNode = new ListNode(value);
    if(head.value >= value) 
    {
      newNode.next = head;
      return newNode;
    }
    ListNode curr = head;
    ListNode prev = null;
    
    while(curr.next!=null)
    {
      prev = curr;
      curr = curr.next;
      if(curr.value>=value)
      {
        newNode.next = curr;
        prev.next = newNode;
        return head;
      }
    }
    if(curr.value<value)
    {
      curr.next = newNode;
    }
    return head;
  }
}
