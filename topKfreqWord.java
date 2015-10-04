
public class Solution {
  public String[] topKFrequent(String[] combo, int k) {
  HashMap<String, Integer> map = new HashMap<String, Integer>();
    for(String s:combo)
    {
    	if(map.containsKey(s))
    		map.put(s, map.get(s)+1);
    	else
    		map.put(s, 1);
    }
    if(k>map.size()) k=map.size();
    Comparator<String> comparator = new Comparator<String>(){
    	@Override
    	public int compare(String a, String b)
    	{
    		if(map.get(a)<map.get(b)) return -1;
    		else
    			return 1;
    	}
    };

    PriorityQueue<String> minheap = new PriorityQueue<String>(comparator);
    int counter = k;
    for(String s : map.keySet())
    {	if(counter==0) break;
    	minheap.offer(s);
    	--counter;
    }
    
    int currfreq, topfreq;
    counter = map.size();
    for(String s:map.keySet())
    {
    	if(counter==k) break;
    	
    	if(minheap.contains(s)) continue;
    	currfreq = map.get(s);
    	topfreq = map.get(minheap.peek());
    	if(currfreq>topfreq)
    	{
    		minheap.poll();
    		minheap.offer(s);
    	}
    	--counter;
    }
    
    String[] ret = new String[k];
    for(int i=k-1;i>=0;--i)
    {
    	ret[i] = minheap.poll();
    }
    return ret;
  }
  
}
