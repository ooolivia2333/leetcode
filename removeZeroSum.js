function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}

var removeZeroSumSublists = function(head) {
    let front = new ListNode(0, head);
    let curr = front;
    let prefixSum = 0;
    let prefixMap = new Map();

    while (curr != null) {
        prefixSum += curr.val;

        if (prefixMap.has(prefixSum)) {
            let prev = prefixMap.get(prefixSum);
            curr = prev.next;

            let p= prefixSum + curr.val;
            while (p != prefixSum) {
                prefixMap.delete(p);
                curr = curr.next;
                p += curr.val;
            }
            
            prev.next = curr.next;
        } else {
            prefixMap.set(prefixSum, curr);
        }

        curr = curr.next;
    }
    return front.next;
};