/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int leftDeep = maxDepth(root.left);
        int rightDeep = maxDepth(root.right);

        return leftDeep > rightDeep? leftDeep +1 : rightDeep + 1;
    }
}
// @lc code=end

