
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
  public List<Integer> inOrder(TreeNode root) {
    List<Integer> newList = new ArrayList<Integer>();
    if(root==null) return newList;
    newList.addAll(inOrder(root.left));
    newList.add(root.key);
    newList.addAll(inOrder(root.right));
    return newList;
  }
}
