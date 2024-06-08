public class rotateList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;
        
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        k = count % k;
        if (k == 0) return head;

        ListNode fast = head;
        ListNode dummyHead = new ListNode(0, head);
        while (k > 0) {
            fast = fast.next;
            k--;
        }
        ListNode tail = head;
        while (fast.next != null) {
            fast = fast.next;
            tail = tail.next;
        }

        dummyHead.next = tail.next;
        fast.next = head;
        tail.next = null;

        return dummyHead.next;
    }

    public static void main(String[] args) {
        
    }
}
