
public class Solution {
  public List<String> validParentheses(int n) {
    ArrayList<String> list = new ArrayList<String>();
    
    if(n==0)
    {
      list.add("");
    
      return list;
    }
    if(n==1) 
    {
      list.add("()");
      return list;
    }
    validPar(n, 0, list, new StringBuilder());
    return list;
  }
  
  void validPar(int open, int close, List<String> list, StringBuilder sb)
  {
    if(open==0 && close==0)
    {
      
      list.add(sb.toString());
      return;
    }
    
    if(open>0)
    {
      sb.append("(");
      validPar(open-1, close+1, list, sb);
      sb.delete(sb.length()-1, sb.length());
    }
   
    if(close>0)
    { 
      sb.append(")");
      validPar(open, close-1, list, sb);
      sb.delete(sb.length()-1, sb.length());
    }
  }
}
