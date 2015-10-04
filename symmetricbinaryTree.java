
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
  public boolean isSymmetric(TreeNode root) {
    if(root == null) return true;
    if(root.left==null && root.right == null) return true;
    return isSym(root.left, root.right);

  }
  
  boolean isSym(TreeNode left, TreeNode right)
  {
    if(left==null && right == null) return true;
    if(left==null || right == null) return false;
    return (left.key == right.key) && isSym(left.left, right.right) && isSym(left.right, right.left);
  }
}
