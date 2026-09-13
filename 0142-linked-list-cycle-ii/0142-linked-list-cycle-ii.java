public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode head1 = head;
        ListNode fast = head;
        ListNode slow = head;
        boolean exist = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                exist = true;
                break ;
            }
        }

        if (!exist)
            return null;

        else {

            while (head1 != fast) {
                head1 = head1.next;
                fast = fast.next;
            }

        }

        return head1 ;
    }
}