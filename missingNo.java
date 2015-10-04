public class Solution {
  public int missing(int[] array) {
    if(array.length==0)
      return 1;
    int sum=0;
    for(int i=0;i<array.length;++i)
    {
        sum+=array[i];
    }
    int total = (1+array.length+1)*(array.length+1)/2;
    return (total-sum);
  }
}