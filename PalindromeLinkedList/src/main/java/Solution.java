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
}
