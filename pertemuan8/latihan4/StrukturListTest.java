package pertemuan8.latihan4;

import pertemuan8.latihan3.StrukturList;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(2);
        list.addTail(3);
        list.addHead(4);
        list.addHead(6);
        list.addHead(7);

        list.displayElement();
        System.out.println("Jumlah elemen: " + list.size());
    }
}
