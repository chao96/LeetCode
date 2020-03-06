import java.util.ArrayList;
import java.util.List;

import javax.xml.soap.Node;

/*
 * @lc app=leetcode.cn id=590 lang=java
 *
 * [590] N叉树的后序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();

        helper(root, res);
        return res;
    }

    public void helper(Node root, List<Integer> res){
        if(root == null){
            return;
        }
        if(root.children != null){
            for(Node node : root.children){
                helper(node, res);
            }
        }
        res.add(root.val);
    }
}
// @lc code=end

