package pertemuan10.tugas2;

public class AbstractStack {
    protected int[] array;
    private int capacity;
    private int TOP;

    public final int MIN = -1;

    public AbstractStack(int capacity){
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    public void push(int data){
        if (isFull()){
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
            System.out.println("push " + data + ", ");
        }
    }

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