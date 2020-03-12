import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=433 lang=java
 *
 * [433] 最小基因变化
 */

// @lc code=start
class Solution {
    int minStep = Integer.MAX_VALUE;

    public int minMutation(String start, String end, String[] bank) {
        dfs(new HashSet<String>(), 0, start, end, bank);
        return minStep == Integer.MAX_VALUE? -1 : minStep;
    }

    public void dfs(Set<String> stepMap, int step, String start, String end, String[] bank){
        if(start.equals(end)){
            if(step < minStep){
                minStep = step;
            }
            return;
        }

        for(int i = 0; i < bank.length; i++){
            int diff = 0;
            for(int j = 0; j < start.length(); j ++){
                if(start.charAt(j) != bank[i].charAt(j)){
                    diff++;
                    if(diff>1) break;
                }
            }
            // 与当前字符串只差一位
            if(diff == 1 && !stepMap.contains(bank[i])){
                stepMap.add(bank[i]);
                dfs(stepMap, step + 1, bank[i], end, bank);
                stepMap.remove(bank[i]);
            }
        }

    }
}
// @lc code=end

