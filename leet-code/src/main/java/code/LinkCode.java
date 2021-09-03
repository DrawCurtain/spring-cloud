package code;

import common.ListNode;

/**
 * @author xuegang
 * @version 1.0
 * @description:
 * @date 2021/8/30 20:23
 */

public class LinkCode {

    /** 
     * @description: 链表两数字相加
     * @param: l1
     * @param: l2 
     * @return: common.ListNode 
     * @author xuegang
     * @date: 2021/8/30 20:36
     */ 
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = null, tail = null;
        int carry = 0;

        while (l1 != null || l2 != null){
            int v1 = l1 == null?0: l1.val;
            int v2 = l2 == null?0: l2.val;
            int sum = v1 + v2 + carry;
            if (head == null){
                head = tail = new ListNode(sum%10);
            }else {
                tail.next = new ListNode(sum%10);
                tail = tail.next;
            }
            if (sum>10){
                carry = 1;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry>0){
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
