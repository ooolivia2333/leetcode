function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}

var rotateRight = function(head, k) {
    if (head == null || head.next == null) return head;

    let n = 0;
    let curr = head;
    while (curr != null) {
        n++;
        curr = curr.next;
    }
    k = k % n;

    let con = head;
    let tail = head;
    while (k > 0) {
        con = con.next;
        k--;
    }

    let dummyHead = new ListNode(0, head);
    while (con.next != null) {
        con = con.next;
        tail = tail.next;
    }

    con.next = dummyHead.next;
    dummyHead.next = tail.next;
    tail.next = null;

    return dummyHead.next;
};