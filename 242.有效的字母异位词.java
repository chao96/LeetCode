import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.containsKey(c1)){
                map.put(c1, map.get(c1)+1);
            } else{
                map.put(c1, 1);
            }
            if(map.containsKey(c2)){
                map.put(c2, map.get(c2)-1);
            } else {
                map.put(c2, -1);
            }
        }
        for(Integer value : map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

