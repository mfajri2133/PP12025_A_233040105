package Pertemuan4.Tugas;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addTail(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }

    public void addHead(double data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void addMid(double data, int position) {
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);
        int i;

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            if (position == 1) {
                newNode.setNext(curNode);
                HEAD = newNode;
            } else {
                i = 1;
                while (curNode != null && i < position) {
                   posNode = curNode;
                   curNode = curNode.getNext();
                   i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }
}
