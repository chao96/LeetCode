/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
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
    public ListNode reverseKGroup(ListNode head, int k) {
        // 区间 [a, b) 包含 k 个待反转元素
        ListNode a = head;
        ListNode b = head;
        for(int i = 0; i < k; i++){
            if(b  == null){
                return head;
            }
            b = b.next;
        }

        // 反转前k个元素
        ListNode newHead = revListNode(a, b);
        // 递归反转后续链表并连接起来
        a.next = reverseKGroup(b, k);

        return newHead;
    }

    // 反转链表 [a,b) 左开右闭
    public static ListNode revListNode(ListNode a, ListNode b) {
        ListNode pre = null;
        ListNode cur = a;

        while(cur != b){
            ListNode tmp = cur;
            cur = cur.next;
            tmp.next = pre;
            pre = tmp;
        }
        return pre;
    }
}
// @lc code=end

