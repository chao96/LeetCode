import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=515 lang=java
 *
 * [515] 在每个树行中找最大值
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>(16);
        dfs(0, root, list);
        return list;
    }

    public void dfs(int level, TreeNode node, List<Integer> list){
        if(node == null) return;
        if(list.size() == level){
            list.add(node.val);
        } else {
            list.set(level, Math.max(list.get(level), node.val));
        }
        dfs(level + 1, node.left, list);
        dfs(level + 1, node.right, list);
    }
}
// @lc code=end

