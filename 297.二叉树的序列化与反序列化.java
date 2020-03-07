import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=297 lang=java
 *
 * [297] 二叉树的序列化与反序列化
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
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder s = new StringBuilder();
        seriaHelper(root, s);
        s.deleteCharAt(s.length()-1);
        return s.toString();
    }

    public void seriaHelper(TreeNode root, StringBuilder s){
        if(root == null){
            s.append("null,");
            return;
        }
        s.append(root.val).append(",");
        seriaHelper(root.left, s);
        seriaHelper(root.right, s);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strs = data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(strs));


        return deHelper(list);
    }

    public TreeNode deHelper(List<String> list){
        if(list.isEmpty()) return null;
        TreeNode root;

        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }

        root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left = deHelper(list);
        root.right = deHelper(list);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
// @lc code=end

