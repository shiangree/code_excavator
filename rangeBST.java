
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
  public List<Integer> getRange(TreeNode root, int min, int max) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    if(root == null) return list;
    if(root.key < min) 
    {
      list.addAll(getRange(root.right, min, max));
      return list;
    }
    if(root.key > max)
    {
      list.addAll(getRange(root.left, min, max));
      return list;
    }
    
    list.addAll(getRange(root.left, min, max));
    list.add(root.key);
    list.addAll(getRange(root.right, min, max));
    return list;
  }
}
