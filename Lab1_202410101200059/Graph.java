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

    }

}