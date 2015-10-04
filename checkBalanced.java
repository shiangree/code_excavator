
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
  public boolean isBalanced(TreeNode root) {
    if(root==null) return true;
    return (Math.abs(getH(root.left) - getH(root.right)) < 2) && isBalanced(root.left) && isBalanced(root.right);
  }
  
  int getH(TreeNode root)
  {
    if(root==null) return 0;
    return 1+Math.max(getH(root.left), getH(root.right));
  }
}
