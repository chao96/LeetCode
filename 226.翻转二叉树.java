/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
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
    public TreeNode invertTree(TreeNode root) {

        recurtion(root);
        return root;
    }

    public void recurtion(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        if(root.left != null){
            recurtion(root.left);
        }
        if(root.right != null){
            recurtion(root.right);
        }
    }
}
// @lc code=end

