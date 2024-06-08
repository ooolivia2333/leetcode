import java.util.HashMap;
import java.util.Map;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class removeZeroSum {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr = dummy;
        Map<Integer, ListNode> prefixMap = new HashMap<>();
        int prefixSum = 0;

        while (curr != null) {
            prefixSum += curr.val;
            if (prefixMap.containsKey(prefixSum)) {
                ListNode prev = prefixMap.get(prefixSum);
                curr = prev.next;

                int p = prefixSum + curr.val;
                while (p != prefixSum) {
                    prefixMap.remove(p);
                    curr = curr.next;
                    p += curr.val;
                }

                prev.next = curr.next;
            } else {
                prefixMap.put(prefixSum, curr);
            }
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        
    }
}
