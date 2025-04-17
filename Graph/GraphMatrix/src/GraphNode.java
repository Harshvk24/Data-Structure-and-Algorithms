public class GraphNode {
    public String name;
    public int index;
    //for single source  Shortest path problem(SSSPP)
    public GraphNode parent;

    public boolean isVisited = false;
    public GraphNode(String name, int index){
        this.index=index;
        this.name  = name;
    }
}
