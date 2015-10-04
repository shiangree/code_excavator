
/**
 * public class GraphNode {
 *   public int key;
 *   public List<GraphNode> neighbors;
 *   public GraphNode(int key) {
 *     this.key = key;
 *     this.neighbors = new ArrayList<GraphNode>();
 *   }
 * }
 */
public class Solution {
  public boolean isBipartite(List<GraphNode> graph) {
    HashMap<GraphNode, Integer> colorSet = new HashMap<GraphNode, Integer>();
    Deque<GraphNode> q = new ArrayDeque<GraphNode>();
    GraphNode curr = graph.get(0);
    q.offer(curr);
    colorSet.put(curr, 1);
    int color,currColor;
    while(!q.isEmpty())
    {
      curr = q.poll();
      currColor = colorSet.get(curr);
      for(GraphNode neighbor : curr.neighbors)
      {
        if(!colorSet.containsKey(neighbor))
        {
          q.offer(neighbor);
          colorSet.put(neighbor, 1-currColor);
        }
        else
        {
          color = colorSet.get(neighbor);
          if(color == colorSet.get(curr))
          {
            return false;
          }
          
        }
        
      }
    }
    return true;
  }
}
