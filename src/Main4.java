import bean.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个链表的公共节点
 */
public class Main4 {

    public static void main(String[] args) {

    }


    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        Set<ListNode> set = new HashSet<>();
        while (pHead1 != null) {
            set.add(pHead1);
            pHead1 = pHead1.next;
        }

        while (pHead2 != null && !set.contains(pHead2)) pHead2 = pHead2.next;
        return pHead2;

    }
}
