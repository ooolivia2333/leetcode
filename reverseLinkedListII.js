var reverseBetween = function(head, left, right) {
    let curr = head, prev = null;
    while (left > 1) {
        prev = curr;
        curr = curr.next;
        left--;
        right--;
    }

    let con = prev, tail = curr;
    while (right > 0) {
        let third = curr.next;
        curr.next = prev;
        prev = curr;
        curr = third;
        right--;
    }

    if (con) {
        con.next = prev;
    } else {
        head = prev;
    }
    tail.next = curr;
    return head;
};