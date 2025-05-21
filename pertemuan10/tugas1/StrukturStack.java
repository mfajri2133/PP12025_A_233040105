package pertemuan10.tugas1;

public class StrukturStack {
    // Latihan 2
    private int[] array;
    private int capacity;
    private int TOP;

    public final int MIN = -1;

    public StrukturStack(int capacity){
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    // Latihan 1
    public void push(int data){
        if (isFull()){
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
            System.out.println("push " + data + ", ");
        }
    }

    // Latihan 3
    public boolean isEmpty(){
        return TOP == MIN;
    }

    public boolean isFull(){
        return TOP == capacity - 1;
    }

    public int size() {
        return TOP + 1;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            return array[TOP];
        }
    }

    public void displayStack() {
        System.out.print("Elemen from TOP: ");
        if (isEmpty()) {
            System.out.print(" ");
        } else {
            for (int i = TOP; i >= 0; i--) {
                System.out.print(array[i]);
            }
        }
    }

    // Tugas
    public int pop() {
        int temp = 0;
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            temp = array[TOP];
            TOP--;
        }
        return temp;
    }
}
