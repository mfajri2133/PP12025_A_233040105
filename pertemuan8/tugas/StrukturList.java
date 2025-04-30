package pertemuan8.tugas;


import pertemuan8.Node;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addTail(int data) {
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

    public void addHead(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void addMid(int data, int position) {
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

    public void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    public void removeTail() {
        if (HEAD != null) {
            if (HEAD.getNext() == null) {
                HEAD = null;
            } else {
                Node preNode = null;
                Node lastNode = HEAD;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }

    public void removeMid(int e) {
        Node preNode = null;
        Node tempNode = HEAD;
        int i = 1;
        boolean ketemu = false;

        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            while (tempNode != null && !ketemu) {
                if (tempNode.getData() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu) {
                if (i == 1) {
                    HEAD = HEAD.getNext();
                } else {
                    preNode.setNext(tempNode.getNext());
                }
                dispose(tempNode);
            } else {
                System.out.println("Elemen " + e + " tidak ditemukan");
            }
        }
    }

    public boolean find(int x) {
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) {
            if (curNode.getData() == x) {
                ketemu = true;
            } else {
                curNode = curNode.getNext();
            }
        }
        return ketemu;
    }

    public int size() {
        Node curNode = HEAD;
        int jumlah = 0;

        while (curNode != null) {
            jumlah++;
            curNode = curNode.getNext();
        }
        return jumlah;
    }

    public void clear() {
        while (HEAD != null) {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
        System.out.println("List kosong");
    }

}

