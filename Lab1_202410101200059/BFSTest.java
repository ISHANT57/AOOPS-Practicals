public class BFSTest {
    public static void main(String[] args) {
        Graph g = new Graph(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        System.out.println("BFS starting from vertex 0:");
        g.bfs(0);

        System.out.println("\n");

        System.out.println("Single vertex graph:");
        Graph g2 = new Graph(1);
        g2.bfs(0);

        System.out.println("\n");

        System.out.println("Disconnected graph:");
        Graph g3 = new Graph(6);
        g3.addEdge(0, 1);
        g3.addEdge(0, 2);
        g3.addEdge(3, 4);
        g3.addEdge(3, 5);
        g3.bfs(0);

        System.out.println("\n");

        System.out.println("Complete graph:");
        Graph g4 = new Graph(5);

        for(int i=0; i<5; i++){
            for(int j=i+1; j<5; j++){
                g4.addEdge(i, j);
            }
        }
        g4.bfs(0);

        System.out.println("\n");

        // diff starting point

        g4.bfs(3);

        System.out.println("\n");

        try{
            g3.addEdge(-1,2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("\n");

        try{
            g2.bfs(11);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }


    }
}