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

}