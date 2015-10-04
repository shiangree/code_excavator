
public class Solution {
  public List<String> permutations(String set) {
    List<String> list = new ArrayList<String>();
    if(set==null) return list;
    if(set.length()==0 || set.length()==1)
    {
      list.add(set);
      return list;
    }
    return perm(set.toCharArray(), list, 0);
  }
  
  List<String> perm(char[] set, List<String> list, int level)
  {
    if(level == set.length)
    {
      StringBuilder sb = new StringBuilder();
      sb.append(set);
      list.add(sb.toString());
      return list;
    }
    for(int i=level;i<set.length;++i)
    {
      swap(set, level, i);
      perm(set, list, level+1);
      swap(set, level, i);
    }
    return list;
    
  }
  void swap(char[] arr, int a, int b)
  {
    if(a==b) return;
    arr[a]^=arr[b];
    arr[b]^=arr[a];
    arr[a]^=arr[b];
    
    
  }
}
