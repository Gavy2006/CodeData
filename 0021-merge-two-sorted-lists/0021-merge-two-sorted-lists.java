class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode l3 = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val >= list2.val) {
                l3.next = list2;
                list2 = list2.next;
                l3 = l3.next;

            }

            else if (list2.val >= list1.val) {
                l3.next = list1;
                list1 = list1.next;
                l3 = l3.next;

            }

        }

        if (list1 != null) {
            l3.next = list1;
        }

        if (list2 != null) {
            l3.next = list2;
        }

        return dummy.next;
    }
}