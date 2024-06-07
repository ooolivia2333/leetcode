function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}

var removeNthFromEnd = function(head, n) {
    let fast = head;
    if (fast.next === null || fast.next.next === null) return null;

    while (n > 0) {
        fast = fast.next;
        n--;
    }

    let curr = head, prev = null;
    while (fast != null) {
        fast = fast.next;
        prev = curr;
        curr = curr.next;
    }
    if (prev) {
        prev.next = curr.next;
    } else {
        head = curr;
    }
    return head;
};