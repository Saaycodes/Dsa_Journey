class Solution {
    public ListNode oddEvenList(ListNode head) {

        // If there are 0 or 1 nodes, nothing needs to be changed
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;

        // Save the starting point of the even nodes
        ListNode evenHead = even;

        // Rearrange the links
        while (even != null && even.next != null) {

            // Connect odd nodes together
            odd.next = even.next;
            odd = odd.next;

            // Connect even nodes together
            even.next = odd.next;
            even = even.next;
        }

        // Put the even list after the odd list
        odd.next = evenHead;

        return head;
    }
}