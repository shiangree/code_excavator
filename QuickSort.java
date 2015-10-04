
public class Solution {
  public int[] quickSort(int[] array) {
  
    if(array==null) return array;
    if(array.length==0 || array.length==1) return array;
    quicksort(array, 0, array.length-1);
    return array;
  }
  void quicksort(int[] array, int l, int r)
  {
    if(l>=r) return;
    int mid = (l+r)/2;
    int p = partition(array, l, r, mid);
    quicksort(array, l, p);
    quicksort(array, p+1, r);
  }
  int partition(int[] array, int l, int r, int pivot)
  {
    int pValue = array[pivot];
    swap(array, r, pivot);
    int i = l;
    int j = r-1;
    while(i<=j)
    {
      if(array[i]<pValue)
      {
        ++i;
      }
      else
      {
        swap(array, i, j--);
      }
    }
    swap(array, i, r);
    return i;
  }
  void swap(int[] array, int a, int b)
  {
    int t = array[a];
    array[a] = array[b];
    array[b] = t;
  }
}
