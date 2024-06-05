public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class partitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode lesser = new ListNode();
        ListNode greater = new ListNode();
        ListNode curr = head;
        head = lesser;
        ListNode greaterHead = greater;

        while (curr != null) {
            if (curr.val < x) {
                lesser.next = curr;
                lesser = lesser.next;
            } else {
                greater.next = curr;
                greater = greater.next;
            }
            curr = curr.next;
        }
        greater.next = null;

        lesser.next = greaterHead.next;
        return head.next;
    }

    public static void main(String[] args) {
        
    }
}
