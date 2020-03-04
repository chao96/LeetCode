/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 * 解法：
 * 一、迭代
 * 二、递归
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
/*
    一、迭代

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;

        ListNode tmp = pre;
        ListNode first = null;
        ListNode second = null;
        while(tmp.next != null && tmp.next.next != null){
            first = tmp.next;
            second = tmp.next.next;

            tmp.next = second;
            first.next = second.next;
            second.next =first;

            tmp = first;
        }
        return pre.next;
    }
}
*/
// 迭代
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;
        ListNode pos = swapPairs(head.next.next);
        second.next = first;
        first.next = pos;

        return second;
    }

}

// @lc code=end

