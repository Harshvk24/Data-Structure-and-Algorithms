import java.util.ArrayList;

public class GraphNode {
    public String name;
    public int index;

    public boolean isVisited = false;

    //for single source  Shortest path problem(SSSPP)
    public GraphNode parent;
    public ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();

    GraphNode(String name, int index){
        this.name =name;
        this.index = index;
    }
}
