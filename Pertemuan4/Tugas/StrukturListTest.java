package Pertemuan4.Tugas;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        StrukturList list2 = new StrukturList();

        System.out.println("Jawaban Tugas 2a");
        list.addTail(4.5);
        list.addMid(3.4,1);
        list.addHead(2.1);

        list.displayElement();

        System.out.println("Jawaban Tugas 2b");
        list2.addTail(4.5);
        list2.addTail(5.5);
        list2.addMid(2.1,1);
        list2.addMid(1.1,2);
        list2.addHead(3.4);
        list2.displayElement();
        
    }
}
