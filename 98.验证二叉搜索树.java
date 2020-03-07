/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }

        return helper(root, null, null);

    }

    public boolean helper(TreeNode root, Integer low, Integer high){
        if(root == null){
            return true;
        }
        int val = root.val;
        if(high != null && val >= high){
            return false;
        }
        if(low != null && val <= low){
            return false;
        }
        // 左子树
        if(!helper(root.left, low, val)){
            return false;
        }
        // 右子树
        if(!helper(root.right, val, high)){
            return false;
        }
        return true;
    }
}
// @lc code=end

