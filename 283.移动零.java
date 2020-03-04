import sun.security.jgss.spnego.SpNegoContext;

/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 * 思路：
 * 定义变量i遍历数组，增加变量j从0开始
 * 当nums[i]!=0时，
 *   若i!=j
 *      nums[j]=nums[i];
 *   j++;
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(i != j){
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}

// @lc code=end

