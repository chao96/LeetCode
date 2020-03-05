/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m == 0){
            while(n > 0){
                nums1[n-1] = nums2[n-1];
                n--;
            }
            return;
        }
        
        if(nums1[m-1] > nums2[n-1]){
            nums1[m + n -1] = nums1[m-1];
            merge(nums1, m-1, nums2, n);
        } else {
            nums1[m + n -1] = nums2[n-1];
            merge(nums1, m, nums2, n-1);
        }
    }
}
// @lc code=end

