
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
  public ListNode merge(ListNode one, ListNode two) {
    if(one==null) return two;
    if(two==null) return one;
    ListNode newHead;
    if(one.value < two.value)
    {
      newHead = one;
      one = one.next;
    }
    else
    {
      newHead = two;
      two = two.next;
    }
    ListNode saveHead = newHead;
    while(one!=null || two!=null)
    {
      if(two==null)
      {
       while(one!=null)
       {
        newHead.next = one;
        one = one.next;
        newHead = newHead.next;
       }
      }
      if(one==null)
      {
        while(two!=null)
        {
          newHead.next = two;
          two = two.next;
          newHead = newHead.next;
        }
      }
      else
      {
        if(one.value>two.value)
        {
          newHead.next = two;
          two = two.next;
        }
        else
        {
          newHead.next = one;
          one = one.next;
        }
        newHead = newHead.next;
      
      }
    }
    return saveHead;
  }
}
