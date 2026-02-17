import java.util.ArrayList;
public class Graph {
    private int vertices_count;
    private ArrayList<ArrayList<Integer>> adjacency_list;



Graph(int vertices_count){
    if(vertices_count < 0)
        throw new IllegalArgumentException("Vertices count cannot be negative");
    this.vertices_count=vertices_count;
    for(int i=0; i<vertices_count; i++){
        adjacency_list.add(new ArrayList<>());
    }
}

public int getVerticesCount(){
    return vertices_count;
}

public void addEdge(int source, int destination){
    if(source < 0 || source >= vertices_count || destination < 0 || destination >= vertices_count)
        throw new IllegalArgumentException("Source and destination must be between 0 and " + (vertices_count - 1));
    adjacency_list.get(source).add(destination);
    adjacency_list.get(destination).add(source);

}

}