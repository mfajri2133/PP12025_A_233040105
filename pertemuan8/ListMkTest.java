package pertemuan8;

public class ListMkTest {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();

        list.addTail(new Matakuliah("IF0001", "Dasar Pemrograman", 4));
        list.addMid(new Matakuliah("IF0003", "Struktur Diskrit", 3), 1);
        list.addMid(new Matakuliah("IF0002", "Pemrograman Web", 3), 1);
        list.addHead(new Matakuliah("IF0004", "Konstruksi PL Berorientasi Objek", 3));

        list.displayElement();
    }
}
