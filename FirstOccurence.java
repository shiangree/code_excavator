
public class Solution {
  public int firstOccur(int[] array, int target) {
    if(array==null) return -1;
    if(array.length == 0) return -1;
    int l=0;
    int r=array.length-1;
    int mid;
    while(l<r-1)
    {
      mid = (l+r)/2;
      if(array[mid] == target)
      {
        r = mid;
      }
      else
      {
        if(array[mid]>target)
        {
          r = mid - 1; 
        }
        else
        {
          l = mid + 1;
        }
      }
    }
    if(array[l] == target) return l;
    if(array[r] == target) return r;
    return -1;
  }
}
