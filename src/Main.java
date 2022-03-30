import bean.ListNode;

import java.util.ArrayList;

/**
 *从尾巴到头 打印链表
 */
public class Main {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);

        ListNode listNode2 = new ListNode(3);

        listNode.next = listNode1;
        listNode1.next = listNode2;

        ArrayList<Integer> a = printListFromTailToHead(listNode);


        for (Integer integer : a) {
            System.out.println(integer);
        }
    }


    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
       ArrayList<Integer> list  =new ArrayList<>();
        while (listNode != null) {
           list.add(0, listNode.val);
            listNode = listNode.next;
        }

        return list;
    }
}
