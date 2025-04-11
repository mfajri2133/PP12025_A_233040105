package pertemuan5.latihan2;

import pertemuan5.latihan1.StrukturList;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addHead(2);
        list.addHead(9);
        list.addHead(7);

        list.displayElement();

        list.removeHead();

        list.displayElement();

        list.removeHead();

        list.displayElement();

        list.removeHead();

        list.displayElement();
    }
}
