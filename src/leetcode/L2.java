package leetcode;

public class L2 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(9);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(9);

        L2 l2 = new L2();
        ListNode listNode = l2.addTwoNumbers(listNode1, listNode2);

        System.out.println("最终结果：");
        while(listNode != null)
        {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            System.out.println("sum:" + sum + " carry:" + carry + " x:" + x + " y:" + y);
            carry = sum / 10;
            System.out.println("carry: " + carry);
            curr.next = new ListNode(sum % 10);

            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}