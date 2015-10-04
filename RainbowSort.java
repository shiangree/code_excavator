
public class Solution {
  public int[] rainbowSort(int[] array) {
    int i=0;
    int j=0;
    int k = array.length-1;
    
    while(j<k)
    {
      if(array[j] == -1)
      {
        swap(array, i++, j++);
      }
      else if(array[j] == 1)
      {
        swap(array, j, k--);
      }
      else
      {
        ++j;
      }
    }
    return array;
  }
  void swap(int[] array, int a, int b)
  {
    if(a==b) return;
    array[a]^=array[b];
    array[b]^=array[a];
    array[a]^=array[b];
  }
}
