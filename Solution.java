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
// - merge it O(n) # ####
public class Solution {
    ListNode head;
    // Adding
    public void add(int val) {
        ListNode newNode = new ListNode(val);
        ListNode current = head;
        if (current == null) {
            current = newNode;
            head = current;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    private void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println("c: " + current.val);
            current = current.next;
        }
    }

    public void reorderList(ListNode head) {

        // Slicing the linked list in half
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = head;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        // head = head of first half
        // slow = head of second half

        // Reversing the second half
        

    }
    // [4][B]->[5][C]->[6][null]    
    private void reverse(ListNode head) {
        if (head == null) return;

        ListNode prev = head;
        System.out.println("prev: " + prev.val);
        reverse(head.next);
        System.out.println("head: " + head.val);
        // System.out.println("head.next: " + head.next.val);
        head.next = prev;
    }

    public static void main(String[] args) {
        Solution l = new Solution();
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        // l.reverse(l.head);
        l.printList(l.head);
    }

}
