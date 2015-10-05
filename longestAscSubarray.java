
public class Solution {
  public int longest(int[] array) {
    
    int len = array.length;
    int[] dp = new int[len];
    dp[0] = 1;
    for(int i=1;i<len;++i)
    {
      if(array[i]>array[i-1])
      {
        dp[i] = dp[i-1]+1;
      }
      else
      {
        dp[i] = 1;
      }
    }
    int max = Integer.MIN_VALUE;
    for(int i=0;i<len;++i)
    {
      max = (dp[i]>max)? dp[i]:max;
    }
    
    return max;
  }
}

