import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        if(slow == null){
            return null;
        }
    
        ListNode pre = head;
        while(pre != slow){
            pre = pre.next;
            slow = slow.next;
        }
        return pre;
    }
}
// @lc code=end

