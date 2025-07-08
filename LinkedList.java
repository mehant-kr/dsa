// splithalf(), 
class Node {
    int data;
    Node next;

    // Initialization using Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) { // if the head is not pointing to any node
            head = newNode; // first node
        } else {
            Node current = head; // don't quite understand it
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node[] splithalf(Node head) {
        // if (head == null || head.next == null)
        // return new Node[] { head, null };

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev = slow;
        slow = slow.next;
        prev.next = null;

        return new Node[] { head, slow };
    }

    // public void join(Node node1, Node node2) {
    // // Node c1 = node1;
    // // Node c2 = node2;
    // // Node node3; // the final joined node
    // // while (node1.next != null || node2.next != null) {
    // // node3 = node1;
    // // }
    // Node node3 = null;
    // Node current = null;

    // node3 = node1;
    // current = node1;
    // node1 = node1.next;

    // System.out.println("node3.data: " + node3.data);

    // }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null)
                System.out.print("->");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        printList(list1.head);
        Node[] l = list1.splithalf(list1.head);
        Node l1 = l[0];
        Node l2 = l[1];

        System.out.println("Splited values");
        printList(l1);
        printList(l2);

        list2.add(15);
        list2.add(25);
        list2.add(35);
        list2.add(45);
        list2.add(55);
        list2.add(65);
        printList(list2.head);

        // LinkedList merged = new LinkedList();
        // merged.join(list1.head, list2.head);

        // list.printList();
    }
}
