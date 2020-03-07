import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if(n < 1){
            return res;
        }
        
        String s = "";
        recursion(0, 0, n, s);

        return res;
    }

    public void recursion(int left, int right, int n, String s){
        // terminator
        if(left == n && right == n){
            res.add(s);
            return;
        }
        // process

        // drill down
        if(left < n){
            recursion(left + 1, right, n, s + '(');
        }
        if(right < left){
            recursion(left, right + 1, n, s + ')');
        }
        // clean
    }
}
// @lc code=end

