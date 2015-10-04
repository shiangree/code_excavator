
public class Solution {
  public List<String> subSets(String set) {
    List<String> list = new ArrayList<String>();
    if(set==null) return list;
    if(set.length()==0)
    {
      list.add(set);
      return list;
    }
    return subset(set.toCharArray(), new StringBuilder(), list, 0);
  }
  List<String> subset(char[] set, StringBuilder sb, List<String> sol, int level)
  {
    
    if(level == set.length)
    {
      sol.add(sb.toString());
      return sol;
    }
    sb.append(set[level]);
    subset(set, sb, sol, level+1);
    sb.delete(sb.length()-1, sb.length());
    subset(set, sb, sol, level+1);
    return sol;
  }
}
