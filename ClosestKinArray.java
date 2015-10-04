
public class Solution {
  public int[] kClosest(int[] array, int target, int k) {
    int l = 0;
    int r = array.length-1;
    int mid;
    int[] closest = new int[k];
    int i=0;
    while(l<r-1)
    {
      mid = (l+r)/2;
      if(array[mid] == target)
      {
        closest[i++] = array[mid];
        r = mid; //does not matter here, we can also use l = mid; because the array is sorted and we will eventually get a two neighbor location
      }
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
    
    while(i<k)
    {
      if(l<0) //boundary check
        closest[i++] = array[r++];
      else if(r>array.length-1)
        closest[i++] = array[l--];
      else if(abs(array[l]-target)<abs(array[r]-target)) //left is closer
        closest[i++] = array[l--];
      else
        closest[i++] = array[r++];
    }


    return closest;
  }
  
  int abs(int a)
  {
    return (a<0)?(-1)*a:a;
  }
}
