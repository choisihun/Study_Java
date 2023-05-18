package kr.hs.dgsw.java.list;

public class LinkedList implements List {
    public Node head;

    @Override
    public void add(String value) {
        Node node = new Node();
        node.value = value;
        if (head == null ) {
            head = node;
        } else {
            Node current = head;

            while (current.next != null ) {
                current = current.next;

            }
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        if (index == 0) {
            // Removing the head nxode
            head = head.next;
        } else {
            Node node = head;
            Node previous = null;

            for (int count = 0; count < index; count++) {
                previous = node;
                node = node.next;
            }

            // Remove the node at the specified index
            previous.next = node.next;
        }
    }

    @Override
    public String get(int index) {
        Node node = head;
        for (int count = 0; count < index; count++) {
            node = node.next;
        }

        return node.value;
    }

    @Override
    public int size() {
        int size = 0;

        Node node = head;

        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }


}
