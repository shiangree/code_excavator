
public class Solution {
  public int binarySearch(int[] array, int target) {
    if(array==null) return -1;
    if(array.length==0) return -1;
    int l = 0;
    int r = array.length-1;
    int mid;
    while(l<=r)
    {
      mid = (l+r)/2;
      if(array[mid] == target)
      {
        return mid;
      }
      else
      {
        if(array[mid]>target)
        {
          r = mid-1;
        }
        else
          l = mid+1;
      }
    }
    return -1;
  }
}
