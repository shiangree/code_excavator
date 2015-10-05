public class Solution {
  public int maxProduct(int n) {
    int[] m = new int[n+1];
    m[0] = m[1] = 0;
    int max=Integer.MIN_VALUE;
    for(int i=2;i<=n;++i)
    {
      m[i] = -1;
      for(int j=1; j<=i/2; ++j)
      {
        max = Math.max(max, Math.max(j, m[j])*Math.max(i-j,m[i-j]));
      }
      m[i] = max;
    }
    return m[n];
  }
}

