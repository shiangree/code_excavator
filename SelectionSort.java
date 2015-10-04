
public class Solution {
  public int[] solve(int[] array) {
    if(array==null) return array;
    if(array.length==0) return array;
    int min=0;
    for(int i=0;i<array.length;++i)
    {
      min = i;
      for(int j=i;j<array.length;++j)
      {
        if(array[j]<array[min])
        {
          min = j;
        }
      }
      swap(array, i, min);
    }
    return array;
  }
  
  void swap(int[] arr, int a, int b)
  {
    if(a==b) return;
    arr[a]^=arr[b];
    arr[b]^=arr[a];
    arr[a]^=arr[b];
  }
}
