
public class Solution {
  public int[] mergeSort(int[] array) {
    if(array==null) return array;
    if(array.length==0 || array.length==1) return array;
    

    return mergesort(array, 0, array.length-1);
  }
  int[] mergesort(int[] array, int l, int r)
  {
    if(l>=r)
    {
      int[] arr = new int[1];
      arr[0] = array[l];
      return arr;
    }
    int mid = (l+r)/2;
    int[] arr1 = mergesort(array, l, mid);
    int[] arr2 = mergesort(array, mid+1, r);
    return merge(arr1, arr2);
    
  }
  int[] merge(int[] arr1, int[] arr2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int[] arr = new int[arr1.length+arr2.length];
    while(i<arr1.length && j<arr2.length)
    {
      if(arr1[i] < arr2[j])
        arr[k++] = arr1[i++];
      else
        arr[k++] = arr2[j++];
    }
    while(i<arr1.length)
    {
      arr[k++] = arr1[i++];
    }
    while(j<arr2.length)
    {
      arr[k++] = arr2[j++];
    }
    return arr;
  }
}
