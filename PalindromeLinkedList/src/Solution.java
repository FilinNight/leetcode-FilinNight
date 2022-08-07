import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/palindrome-linked-list/"> 234. Palindrome Linked List </a>
 */
public class Solution {

    public boolean isPalindrome(ListNode head) {
        if (head != null) {
            if (head.next == null) return true;

            List<Integer> values = new ArrayList<>();
            int count = 0;

            while (count <= 1000000) {
                if (head == null) break;
                values.add(head.val);
                head = head.next;
                count++;
            }

            for (int i = 0; i < values.size() / 2; i++) {
                if (!values.get(i).equals(values.get(values.size() - i - 1))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void test() {
        ListNode listNode_7 = new ListNode(1, null);
        ListNode listNode_6 = new ListNode(3, listNode_7);
        ListNode listNode_5 = new ListNode(5, listNode_6);
        ListNode listNode_4 = new ListNode(6, listNode_5);
        ListNode listNode_3 = new ListNode(5, listNode_4);
        ListNode listNode_2 = new ListNode(3, listNode_3);
        ListNode node_head = new ListNode(1, listNode_2);

        boolean result_1 = isPalindrome(node_head);

        listNode_7.next = new ListNode(10, null);

        boolean result_2 = isPalindrome(node_head);

        if (result_1 && !result_2) {
            System.out.println("\nAll tests passed.\n");
        } else {
            System.out.println("\nAny tests failed!\n");
        }
    }
}
