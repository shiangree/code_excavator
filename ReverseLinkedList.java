//循环
public class Solution {
  public ListNode reverse(ListNode head) {
    if(head == null) return head;
    if(head.next == null) return head;
    ListNode next = null;
    ListNode prev = null;
    ListNode curr = head;
    while(curr!=null)
    {
      next = curr.next; //暂存next
      curr.next = prev; //目前的next变为prev
      prev = curr;//新的prev
      curr = next;//iterator继续
    }
    
    return prev;
  }
}
//递归
public class Solution {
  public ListNode reverse(ListNode head) {
    if(head==null) return head;
    if(head.next==null) return head;
    ListNode curr = head;
    head = reverse(head.next);//一直存着新head（即原List最后一个node），并且一直递归到原List最后一个node
    curr.next.next = curr;//reverse目前的node
    curr.next = null;//目前node的next，这个next的更新要留到上一层递归实现
    return head;
  }
}