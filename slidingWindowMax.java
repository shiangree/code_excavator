public class Solution {
   public int[] maxSlidingWindow(int[] nums, int k) {
        // write your code here
        if(nums==null) return nums;
        if(nums.length==0) return nums;
    	int[] ans = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int i = 0;
        int j = 0;
        
        for(int now : nums) {
            i++;
            
    		while((!deque.isEmpty() && now > deque.peekLast())) {
    			deque.pollLast();
    		} 
    		deque.offer(now);
    		if(i > k  && deque.peekFirst() == nums[i - k - 1])
    		         deque.pollFirst();
    		if(i >= k) {
    			ans[j++]=(deque.peekFirst());
    		}
            
        }
        return ans;

    }
}
