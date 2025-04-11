package pertemuan5.latihan4;

import pertemuan5.latihan3.StrukturList;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(5);
        list.addTail(1);
        list.addHead(3);
        list.addHead(6);
        list.addHead(2);

        list.displayElement();

        list.removeTail();

        list.displayElement();

        list.removeHead();

        list.displayElement();

        list.removeTail();

        list.displayElement();
    }
}
