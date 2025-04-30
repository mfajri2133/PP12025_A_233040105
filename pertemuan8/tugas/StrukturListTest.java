package pertemuan8.tugas;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addHead(8);
        list.addHead(7);
        list.addHead(3);
        list.addHead(4);
        list.addTail(1);
        list.addTail(9);

        list.displayElement();

        list.clear();

        list.displayElement();
    }
}
