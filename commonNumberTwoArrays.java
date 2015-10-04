public class Solution {
  public List<Integer> common(List<Integer> A, List<Integer> B) {
    int i=0;
    int j=0;
    List<Integer> sol = new ArrayList<Integer>();
    while(i<A.size() && j<B.size())
    {
      if(A.get(i)<B.get(j))
        i++;
      else
      if(A.get(i)>B.get(j))
        j++;
      else
      {
        sol.add(B.get(j++));
        i++;
      }
    }
    return sol;
  }
}