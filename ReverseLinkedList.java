//ѭ��
public class Solution {
  public ListNode reverse(ListNode head) {
    if(head == null) return head;
    if(head.next == null) return head;
    ListNode next = null;
    ListNode prev = null;
    ListNode curr = head;
    while(curr!=null)
    {
      next = curr.next; //�ݴ�next
      curr.next = prev; //Ŀǰ��next��Ϊprev
      prev = curr;//�µ�prev
      curr = next;//iterator����
    }
    
    return prev;
  }
}
//�ݹ�
public class Solution {
  public ListNode reverse(ListNode head) {
    if(head==null) return head;
    if(head.next==null) return head;
    ListNode curr = head;
    head = reverse(head.next);//һֱ������head����ԭList���һ��node��������һֱ�ݹ鵽ԭList���һ��node
    curr.next.next = curr;//reverseĿǰ��node
    curr.next = null;//Ŀǰnode��next�����next�ĸ���Ҫ������һ��ݹ�ʵ��
    return head;
  }
}