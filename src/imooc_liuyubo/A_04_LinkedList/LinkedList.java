package imooc_liuyubo.A_04_LinkedList;

public class LinkedList<E> {

    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        //一行顶三行
        head = new Node(e, head);
        size++;
    }

    public void add(int index, E e) {
        //判空
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add Fail, Illegal index");
        }

        if (index == 0) {
            addFirst(e);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }

//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;

            prev.next = new Node(e, prev.next);
            size++;
        }
    }

    public void addLast(E e) {
        add(size, e);
    }


    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this.e = e;
        }

        public Node() {

        }


        @Override
        public String toString() {
            return "Node{" +
                    "e=" + e +
                    '}';
        }
    }
}
