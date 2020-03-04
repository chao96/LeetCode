/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 * 双指针遍历
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode tmp = cur;
            cur = cur.next;
            tmp.next = pre;
            pre = tmp;

        }
        return pre;
    }
}
// @lc code=end

