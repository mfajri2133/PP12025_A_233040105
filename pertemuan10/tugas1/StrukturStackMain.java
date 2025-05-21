package pertemuan10.tugas1;

// Latihan 4
public class StrukturStackMain {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        System.out.println("#Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayStack();

        System.out.println("#Melakukan push 3x: ");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayStack();
    }
}
