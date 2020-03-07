import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {

        return subElement(nums, 0, nums.length-1);
    }

    public int subElement(int[] nums, int low, int high){
        if(low == high) return nums[low];

        int mid = (high - low)/2 + low;
        int left = subElement(nums, low, mid);
        int right = subElement(nums, mid + 1, high);

        if(left == right){
            return left;
        }

        int l = countNum(nums, left, low, high);
        int r = countNum(nums, right, low, high);

        return l > r? left : right;
    }

    public int countNum(int[] nums, int num, int low, int high){
        int count = 0;
        for(int i = low; i <= high; i++){
            if(num == nums[i])
                count++;
        }
        return count;
    }
}
// @lc code=end

