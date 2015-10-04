public class Solution {
  public List<List<Integer>> combinations(int target, int[] coins) {
	    List<List<Integer>> sol = new ArrayList<List<Integer>>();
	    
	    List<Integer> result = new ArrayList<Integer>();
	    if(target == 0)
	    {
	      for(int i=0;i<coins.length;++i)
  	      result.add(0);
	      sol.add(result);
	      return sol;
	    }
	    findCoin(coins, result, target, 0, sol);
	    return sol;
	  }
	  
	  public void findCoin(int[] input, List<Integer> result, int remain, int cur_lv, List<List<Integer>> sol)
	  {
	   if(cur_lv == input.length)
	    {
	        if(remain!=0) return;
          ArrayList<Integer> list = new ArrayList<Integer>();
          for(Integer i : result)
	          list.add(i);
	        sol.add(list);
	        return;
	    }
	    
	    int branches = remain/input[cur_lv];
	    for(int i=0;i<=branches;++i)
	    {
	      result.add(i);
	      findCoin(input, result, remain-input[cur_lv]*i, cur_lv+1, sol);
	      result.remove(result.size()-1);
	      
	    }
	  
	  }

  
}