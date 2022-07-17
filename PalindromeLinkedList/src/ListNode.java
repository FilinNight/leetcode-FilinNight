public class ListNode {
    private int val;

    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void setVal(int value) {
        if (value > 9 || value < 0) {
            this.val = 0;
        } else {
            this.val = value;
        }
    }

    public int getVal() {
        return this.val;
    }
}
