function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}

var deleteDuplicates = function(head) {
    let dummy = new ListNode(0, head);

    let pred = dummy;

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
};