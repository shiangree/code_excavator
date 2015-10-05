
public class Solution {
  public boolean canJump(int[] array) {
    int lastPos = array.length-1;
    boolean[] ability = new boolean[lastPos+1];
    ability[lastPos] = true;
    for(int i=lastPos-1; i>=0; --i)
    {
      int steps = array[i];
      if(steps == 0)
        continue;
      if(i+steps>lastPos) 
        ability[i] = true;
      else
      for(int j = i; j<=i+steps; ++j)
      {
        
        if(ability[j])
          ability[i] = true;
      }
    }
    return ability[0];
  }
}

