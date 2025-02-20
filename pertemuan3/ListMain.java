package pertemuan3;

import pertemuan3.StrukturList;

public class ListMain {
    public static void main(String[] args) {
        // Tes-1 a
        StrukturList list1a = new StrukturList();
        list1a.addTail(3);
        list1a.addTail(4);
        list1a.addTail(5);
        System.out.print("Elemen (Tes-1 a): ");
        list1a.displayElement();

        // Tes-1 b
        StrukturList list1b = new StrukturList();
        list1b.addTail(1);
        list1b.addTail(4);
        list1b.addTail(5);
        list1b.addTail(7);
        System.out.print("Elemen (Tes-1 b): ");
        list1b.displayElement();

        // Tes-2
        StrukturList list2 = new StrukturList();
        list2.addHead(5);
        list2.addHead(4);
        list2.addHead(3);
        System.out.print("Elemen (Tes-2): ");
        list2.displayElement();

        // Tes-3 a
        StrukturList list3a = new StrukturList();
        list3a.addHead(1);
        list3a.addHead(2);
        list3a.addHead(3);
        System.out.print("Elemen (Tes-3 a): ");
        list3a.displayElement();

        // Tes-3 b
        StrukturList list3b = new StrukturList();
        list3b.addTail(1);
        list3b.addTail(4);
        list3b.addTail(5);
        list3b.addTail(7);
        System.out.print("Elemen (Tes-3 b): ");
        list3b.displayElement();
    }
}
