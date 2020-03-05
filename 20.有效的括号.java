import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> charMap = new HashMap<>(3);
        charMap.put(')','(');
        charMap.put('}','{');
        charMap.put(']','[');

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!charMap.containsKey(c)){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                if(!Objects.equals(charMap.get(c), stack.pop())){
                    return false;
                }
            }
        }
        return stack.size() == 0? true : false;
    }
}
// @lc code=end

