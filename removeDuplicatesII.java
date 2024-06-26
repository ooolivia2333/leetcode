public class removeDuplicatesII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);

        ListNode pred = dummy;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                pred.next = head.next;
            } else {
                pred = pred.next;
            }

            head = head.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        
    }
}
