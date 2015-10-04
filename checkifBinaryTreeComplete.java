
/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  public boolean isCompleted(TreeNode root) {
    if(root == null) return true;
    if(root.left == null && root.right == null) return true;
    Deque<TreeNode> q = new ArrayDeque<TreeNode>();
    q.offer(root);
    TreeNode curr;
    boolean flag = false;
    while(!q.isEmpty())
    {
      curr = q.poll();
      if(curr.left!=null)
      {
        if(flag) return false;//�����ӣ������ڵ������ߵĽڵ�û���Һ��� -> ������һ���м��û������
        else
          q.offer(curr.left);
      }
      else flag = true;//û�����ӣ���flag
      if(curr.right!=null)
      {
        if(flag) return false;//���Һ��ӣ���û������
        else
          q.offer(curr.right);
      }
      else flag = true;//û���Һ��ӣ���flag����һ������ұߵĽڵ�
      
    }
    return true;
  }
}
