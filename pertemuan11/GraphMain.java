package pertemuan11;

// Latihan 5
public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addVertex('E');

        g.addEdge(0,1); // A - B
        g.addEdge(1,2); // B - C
        g.addEdge(0,3); // A - D
        g.addEdge(3,4); // D - E
        g.adjacencyMatrix();
        System.out.println();

        // Latihan 6
        Graph gLatihan6 = new Graph(4);
        gLatihan6.addVertex('A');
        gLatihan6.addVertex('B');
        gLatihan6.addVertex('C');
        gLatihan6.addVertex('D');

        gLatihan6.addEdge(0,1); // A - B
        gLatihan6.addEdge(1,3); // B - D
        gLatihan6.addEdge(3,0); // D - A
        gLatihan6.addEdge(0,2); // A - C
        gLatihan6.adjacencyMatrix();
        System.out.println();
    }
}
