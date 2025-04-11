package pertemuan6.latihan2;

import pertemuan6.latihan1.StrukturList;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addHead(1);
        list.addHead(5);
        list.addHead(3);
        list.addHead(6);
        list.addHead(2);

        list.displayElement();

        list.removeMid(3);

        list.displayElement();

        list.removeMid(5);
        list.removeMid(6);

        list.displayElement();
    }
}
