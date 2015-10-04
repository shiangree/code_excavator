
public class Solution {
  public int kthSmallest(int[][] matrix, int k) {
    
    class Node{
      int value;
      int col;
      int row;
      public Node(int value, int col, int row)
      {
        this.value = value;
        this.col = col;
        this.row = row;
      }
      public Node(){
        this.value = -1;
        this.col = -1;
        this.row = -1;
      }
    };
    
    
    Comparator<Node> comparator = new Comparator<Node>(){
      @Override
      public int compare(Node a, Node b)
      {
        if(a.value<b.value) return -1;
        else return 1;
      }
    };
    PriorityQueue<Node> q = new PriorityQueue<Node>(comparator);
    int colmax = matrix.length;
    int rowmax = matrix[0].length;
    boolean[][] visited = new boolean[colmax][rowmax];
    visited[0][0] = true;
    q.offer(new Node(matrix[0][0], 0, 0));
    Node curr = new Node();
    int col, row;
    int value;
    int counter=0;
    while(counter<k)
    {
      
      curr = q.poll();
      col = curr.col;
      row = curr.row;
      value = curr.value;
      if(col+1<colmax && !visited[col+1][row])
      {
        q.offer(new Node(matrix[col+1][row], col+1, row));
        visited[col+1][row] = true;
      }
      if(row+1<rowmax && !visited[col][row+1])
      {
        q.offer(new Node(matrix[col][row+1], col, row+1));
        visited[col][row+1] = true;
      }
      counter++;
    }
    return curr.value;
  }
}
