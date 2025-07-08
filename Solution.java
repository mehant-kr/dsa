/**
 * Definition for singly-linked list.
 **/
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

// Brut force what I can think of:
// Brut force:
// - divide into half O(n)
// - reverse the second half O(n)
// - merge it O(n)
class Solution {
    public void reorderList(ListNode head) {

        if (head == null) {
            return;
        }
        System.out.println(head.val);
        reorderList(head.next);
        System.out.println(head.val);
    }

    private void reverseList(ListNode head) {

    }
}
