import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0){
            return nums;
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<Integer>();
        for(int i = 0; i < k && i < nums.length; i++){
            while(!deque.isEmpty() && nums[i] > nums[deque.getLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        res[0] = nums[deque.getFirst()];

        for(int i = k; i < nums.length; i++){
            if(i == deque.getFirst() + k){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && nums[i] > nums[deque.getLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
            res[i-k+1] = nums[deque.getFirst()];
        }
        return res;
    }
}
// @lc code=end

