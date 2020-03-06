import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import javax.xml.soap.Node;

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N叉树的层序遍历
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
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null){
            return Collections.emptyList();
        }
        List<List<Integer>> res = new ArrayList<>();
        Deque<Node> deque = new LinkedList<>();
        deque.addLast(root);
        
        while(!deque.isEmpty()){
            int n = deque.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                Node node = deque.removeFirst();
                list.add(node.val);
                if(node.children != null){
                    for(Node tmp : node.children){
                        deque.addLast(tmp);
                    }
                }
            }
            res.add(list);
        }

        return res;
    }
}
// @lc code=end

