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
