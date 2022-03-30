import bean.ListNode;

import java.util.HashSet;
import java.util.Set;


/**
 * 链表中 环的入口
 */
public class Main5 {
    public static void main(String[] args) {

    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        Set<ListNode> set = new HashSet<>();
        while (pHead != null) {
            if (!set.add(pHead)) {
                return pHead;
            }
            pHead = pHead.next;
        }
        return null;
    }
}
