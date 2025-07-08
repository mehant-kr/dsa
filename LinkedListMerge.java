class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedListMerge {
    Node head;

    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        }
        Node c = head;
        while (c.next != null) {
            c = c.next;
        }
        c.next = newNode;
    }

    public void printList(Node head) {
        Node current = head;
        while (current.next != null) {
            System.out.println("->" + current.val);
            current = current.next;
        }
    }

    // Merge using pointer
    public Node merge(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }
        return dummy.next;

    }

    // Merge using recursion
    public Node merger(Node l1, Node l2) {

        if (l1.val <= l2.val) {
            list1.next = 
        }
    }

    public static void main(String[] args) {
        LinkedListMerge l1 = new LinkedListMerge();
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(9);
        l1.printList(l1.head);

        LinkedListMerge l2 = new LinkedListMerge();
        l2.add(1);
        l2.add(2);
        l2.add(5);
        l2.add(7);
        l2.printList(l2.head);

    }
}
