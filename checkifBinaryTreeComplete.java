
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
        if(flag) return false;//有左孩子，但爹节点或者左边的节点没有右孩子 -> 至少有一层中间层没有填满
        else
          q.offer(curr.left);
      }
      else flag = true;//没有左孩子，立flag
      if(curr.right!=null)
      {
        if(flag) return false;//有右孩子，但没有左孩子
        else
          q.offer(curr.right);
      }
      else flag = true;//没有右孩子，立flag给下一层或者右边的节点
      
    }
    return true;
  }
}
