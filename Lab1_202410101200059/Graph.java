import java.util.*;
public class Graph {
    private int vertices_count;
    private ArrayList<ArrayList<Integer>> connections;



    Graph(int vertices){
        
        if(vertices < 0)
            throw new IllegalArgumentException("Vertices count cannot be negative");
        
        this.vertices_count = vertices;

        connections = new ArrayList<>();

        for(int i=0; i<vertices_count; i++){
            connections.add(new ArrayList<>());
        }

        // System.out.println("Graph created succesfully with" + vertices_count + "vertices");
    }

    public int getVerticesCount(){
        return vertices_count;
    }

    public void addEdge(int source, int destination){
        if(source < 0 || source >= vertices_count || destination < 0 || destination >= vertices_count)
            throw new IllegalArgumentException("Source and destination must be between 0 and " + (vertices_count - 1));
        
        if(!connections.get(source).contains(destination)){
            connections.get(source).add(destination);
        }

        if(!connections.get(destination).contains(source)){
            connections.get(destination).add(source);
        }

        // System.out.println("Undirected Graph");

    }

    public int getNumVertices() {
        return vertices_count;
    }
    
    public void bfs(int start) {
        if(start < 0 || start >= vertices_count)
            throw new IllegalArgumentException("Start vertex must be between 0 and " + (vertices_count - 1));
        
        boolean[] visited_array = new boolean[vertices_count];
        Queue<Integer> queue = new LinkedList<>();

        visited_array[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){

            int curr = queue.poll();
            System.out.print(curr + " ");

            for(int neigh : connections.get(curr)){
                if(!visited_array[neigh]){
                    visited_array[neigh]=true;
                    queue.add(neigh);
                }
            }
        }
    }

    //System.out.println("BFS traversal");

}