function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}

var partition = function(head, x) {
    let lesser = new ListNode(0);
    let greater = new ListNode(0);
    let curr = head;
    head = lesser;
    let greaterHead = greater;
    while (curr != null) {
        if (curr.val < x) {
            lesser.next = curr;
            lesser = lesser.next;
        } else {
            greater.next = curr;
            greater = greater.next;
        }
        curr = curr.next;
        console.log(curr);
    }

    greater.next = null;
    lesser.next = greaterHead.next;
    return head.next;
};