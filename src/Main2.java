import bean.ListNode;

import java.util.Stack;

/**
 * 翻转链表
 */
public class Main2 {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);

        ListNode listNode2 = new ListNode(3);

        listNode.next = listNode1;
        listNode1.next = listNode2;

        ListNode listNode3 = ReverseList(listNode);


        while (listNode3 != null) {
            System.out.println(listNode3.val);
            listNode3 = listNode3.next;
        }

    }


    public static ListNode ReverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        if (stack.isEmpty()) return null;

        ListNode listNode = stack.pop();
        ListNode dump = listNode;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            listNode.next = node;
            listNode = listNode.next;
        }

        listNode.next = null;
        return dump;
    }
}
