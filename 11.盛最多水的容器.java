/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 * 思路：
 * 一次循环，左右双指针遍历，每次用两柱子中的低的高度minHigh*（j-i+1）与当前最大面积比较
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i = 0, j = height.length - 1; i < j; ){
            int minHigh;
            if(height[i] < height[j]){
                minHigh = height[i];
                i++;
            } else {
                minHigh = height[j];
                j--;
            }
            int area = (j - i + 1) * minHigh;

            if(area > max){
                max = area;
            }
        } 
        return max;
    }
}
// @lc code=end

