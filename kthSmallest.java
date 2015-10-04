
public class Solution {
  public int[] kSmallest(int[] array, int k) {
    if(k==0) return new int[0];
    Comparator<Integer> comparator = new Comparator<Integer>()
    {
      @Override
      public int compare(Integer a, Integer b)
      {
        if(a<b) return 1;
        else return -1;
      }
      
    };
    
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(comparator);
    for(int i=0;i<k;++i)
    {
      pq.offer(array[i]);
    }
    for(int j=k;j<array.length;++j)
    {
      if(pq.peek()>array[j])
      {
        pq.poll();
        pq.offer(array[j]);
      }
    }
    
    
    int[] ret = new int[k];
    for(int i=k-1;i>=0;--i)
    {
      ret[i] = pq.poll();
    }
    return ret;
  }
}
