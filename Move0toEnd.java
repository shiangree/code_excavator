
public class Solution {
  public int[] moveZero(int[] array) {
    int j=array.length-1;
    for(int i=0;i<array.length;++i)
    {   
        
       
        if(array[i] == 0 && i<j)
        {
          swap(array, i, j--);
        }
    }
    
    return array;
  }
  void swap(int[] arr, int a, int b)
  {
    arr[a]^=arr[b];
    arr[b]^=arr[a];
    arr[a]^=arr[b];
  }
}
