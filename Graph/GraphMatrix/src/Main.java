import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList  = new ArrayList<GraphNode>();
//        nodeList.add(new GraphNode("A",0));
//        nodeList.add(new GraphNode("B",1));
//        nodeList.add(new GraphNode("C",2));
//        nodeList.add(new GraphNode("D",3));
//        nodeList.add(new GraphNode("E",4));
//
//        Graph g = new Graph(nodeList);
//        g.addUndirected(0,1);
//        g.addUndirected(0,2);
//        g.addUndirected(0,3);
//        g.addUndirected(1,4);
//        g.addUndirected(2,3);
//        g.addUndirected(3,4);
//        System.out.println(g.toString());

        //g.bfs();
//       g.dfs();

//        nodeList.add(new GraphNode("A",0));
//        nodeList.add(new GraphNode("B",1));
//        nodeList.add(new GraphNode("C",2));
//        nodeList.add(new GraphNode("D",3));
//        nodeList.add(new GraphNode("E",4));
//        nodeList.add(new GraphNode("F",5));
//        nodeList.add(new GraphNode("G",6));
//        nodeList.add(new GraphNode("H",7));
//        Graph newGraph= new Graph(nodeList);
//        newGraph.addDirectedEdge(0,2);
//        newGraph.addDirectedEdge(2,4);
//        newGraph.addDirectedEdge(4,7);
//        newGraph.addDirectedEdge(4,5);
//        newGraph.addDirectedEdge(5,6);
//        newGraph.addDirectedEdge(1,2);
//        newGraph.addDirectedEdge(1,3);
//        newGraph.addDirectedEdge(3,5);
//
//        System.out.println(newGraph.toString());
//        newGraph.topologicalSort();

        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));
        nodeList.add(new GraphNode("F",5));
        nodeList.add(new GraphNode("G",6));

        Graph g = new Graph(nodeList);
        g.addUndirected(0,1);
        g.addUndirected(0,2);
        g.addUndirected(1,3);
        g.addUndirected(1,6);
        g.addUndirected(2,3);
        g.addUndirected(2,4);
        g.addUndirected(3,5);
        g.addUndirected(4,5);
        g.addUndirected(5,6);
//        System.out.println(g.toString());
        g.BFSforSSSPP(nodeList.get(0));
    }
}