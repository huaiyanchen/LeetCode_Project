package problem206_reverseList;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/4/5-21:53
 * @Since:jdk1.8
 * @Description:TODO
 */
class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.val = 1;
        System.out.println(reverseList(listNode).toString());

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}