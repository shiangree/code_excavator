
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
  public boolean isBST(TreeNode root) {
    if(root==null) return true;
    return isbst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  boolean isbst(TreeNode root, int min, int max)
  {
      if(root == null) return true;
      return (root.key<max) && (root.key>min) && isbst(root.left, min, root.key) && isbst(root.right, root.key, max);
  }
}
