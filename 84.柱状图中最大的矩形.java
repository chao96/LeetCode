import java.util.Stack;

/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);

        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            while(stack.peek() != -1 && heights[i] < heights[stack.peek()]){
                int high = heights[stack.pop()];
                int area = high * (i - stack.peek() - 1);
                if(area > maxArea){
                    maxArea = area;
                }
            }
            stack.add(i);
        }
        while(stack.size() > 1){
            int i = stack.pop();
            int high = heights[i];
            int area = high * (heights.length - stack.peek() -1);
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
// @lc code=end

