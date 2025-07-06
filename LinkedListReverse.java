class Node {
    int val;
    Node next;

    Node(int data) {
        this.val = data;
        this.next = null;
    }
}

public class LinkedListReverse {
    Node head;

    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node c = head;
            while (c.next != null) {
                c = c.next;
            }
            c.next = newNode;
        }
    }

    public Node reverseList(Node head) {
        if (head == null) {
            return null;
        }

        Node newHead = head;
        if (head.next != null) {
            newHead = reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;

        return newHead;
    }

    public void printlist() {
        Node current = this.head;
        while (current != null) {
            System.out.print("->" + current.val);
            current = current.next;
        }
        System.out.println("");
    }

    public void printlist(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print("->" + current.val);
            current = current.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();
        list.add(20);
        list.add(30);
        list.add(40);

        list.printlist();
        Node head = list.reverseList(list.head);
        list.printlist(head);

    }
}
