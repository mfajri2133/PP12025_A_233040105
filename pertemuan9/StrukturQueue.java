package pertemuan9;

public class StrukturQueue {

    // LATIHAN 2
    private Node FRONT;
    private Node REAR;

    StrukturQueue() {
        FRONT = null;
        REAR = null;
    }

    public boolean isEmpty() {
        return FRONT == null;
    }

    // LATIHAN 1
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    // LATIHAN 3
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }

    // TUGAS
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak bisa dequeue.");
        } else {
            System.out.println("Menghapus: " + FRONT.getData());
            FRONT = FRONT.getNext();
            if (FRONT == null) {
                REAR = null;
            }
        }
    }

    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue kosong");
            return;
        }

        System.out.print("Elemen Queue: ");
        Node curNode = FRONT;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
}
