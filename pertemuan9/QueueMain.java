package pertemuan9;

public class QueueMain {
    public static void main(String[] args) {
        // Latihan 4
        StrukturQueue q1 = new StrukturQueue();
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("size: " + q1.size());
        System.out.println("isEmpty: " + q1.isEmpty());

        q1.enqueue(3);
        q1.enqueue(2);
        q1.enqueue(1);

        System.out.println("\n### Enqueue 3x ###");
        System.out.println("size: " + q1.size());
        System.out.println("isEmpty: " + q1.isEmpty());
        System.out.println("Front: " + q1.front());

        // Latihan 5
        StrukturQueue q2 = new StrukturQueue();
        System.out.println("\n### Sebelum Enqueue 4x ###");
        System.out.println("size: " + q2.size());
        System.out.println("isEmpty: " + q2.isEmpty());
        q2.displayElements();

        q2.enqueue(2);
        q2.enqueue(7);
        q2.enqueue(6);
        q2.enqueue(1);

        System.out.println("\n### Enqueue 4x ###");
        System.out.println("size: " + q2.size());
        System.out.println("isEmpty: " + q2.isEmpty());
        q2.displayElements();
        System.out.println("Front: " + q2.front());

        // Tugas: Dequeue 2x
        System.out.println("\n### Dequeue 2x ###");
        q2.dequeue();
        q2.dequeue();
        System.out.println("size: " + q2.size());
        q2.displayElements();
        System.out.println("Front: " + q2.front());
    }
}
