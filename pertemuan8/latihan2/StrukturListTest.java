package pertemuan8.latihan2;

import pertemuan8.latihan1.StrukturList;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(5);
        list.addTail(4);
        list.addTail(6);

        list.displayElement();

        System.out.println(list.find(6));
    }
}
