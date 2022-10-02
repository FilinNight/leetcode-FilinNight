import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void isPalindromeTest() {
        Solution solution = new Solution();

        ListNode listNode_7 = new ListNode(1, null);
        ListNode listNode_6 = new ListNode(3, listNode_7);
        ListNode listNode_5 = new ListNode(5, listNode_6);
        ListNode listNode_4 = new ListNode(6, listNode_5);
        ListNode listNode_3 = new ListNode(5, listNode_4);
        ListNode listNode_2 = new ListNode(3, listNode_3);
        ListNode node_head = new ListNode(1, listNode_2);

        boolean result_1 = solution.isPalindrome(node_head);

        listNode_7.next = new ListNode(10, null);

        boolean result_2 = solution.isPalindrome(node_head);

        assertTrue(result_1 && !result_2);
    }
}
