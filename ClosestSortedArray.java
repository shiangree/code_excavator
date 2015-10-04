
public class Solution {
  public int closest(int[] array, int target) {
    if(array==null) return -1;
    if(array.length==0) return -1;
    int l = 0;
    int r = array.length-1;
    int mid;
    
    while(l<r-1)
    {
      mid = (l+r)/2;
      if(array[mid] == target)
        return mid;
      else
      {
        if(array[mid]>target)
        {
          r = mid;
        }
        else
        {
          l = mid;
        }
      }
    }
    if(abs(array[l] - target) < abs(array[r] - target))
      return l;
    else
      return r;
  }
  
  int abs(int a)
  {
    return (a<0)?(-1)*a:a;
  }
}
