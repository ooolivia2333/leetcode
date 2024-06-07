public class reverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return head;

        ListNode curr = head, prev = null;
        while (left > 1) {
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        }

        ListNode con = prev, tail = curr;

        while (right > 0) {
            ListNode third = curr.next;
            curr.next = prev;
            prev = curr;
            curr = third;
            right--;
        }

        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }
        tail.next = curr;
        return head;
    }

    public static void main(String[] args) {
        
    }
}
