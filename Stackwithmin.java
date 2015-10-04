public class Solution {
  
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
  
  
  public Integer pop() {
    if(stack1.empty()) return -1;
    if(stack1.peek() == stack2.peek())
    {
      stack1.pop();
      return stack2.pop();
    }
    else
    {
      return stack1.pop();
    }
    
  }
  
  public void push(int element) {
    if(stack2.empty() || element<=stack2.peek())
    {
      stack1.push(element);
      stack2.push(element);
    }
    else
      stack1.push(element);
  }
  
  public Integer top() {
    if(stack1.empty()) return -1;
    return stack1.peek();
  }
  
  public Integer min() {
    if(stack2.empty()) return -1;
    return stack2.peek();
  }
  
}
