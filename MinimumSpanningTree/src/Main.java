import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList=new ArrayList<>();
        nodeList.add(new WeightedNode("A"));
        nodeList.add(new WeightedNode("B"));
        nodeList.add(new WeightedNode("C"));
        nodeList.add(new WeightedNode("D"));
        nodeList.add(new WeightedNode("E"));
//        DisjointSet.makeSet(nodeList);
//        WeightedNode firstNode = nodeList.get(0);
//        WeightedNode secondNode = nodeList.get(1);
//        DisjointSet output =DisjointSet.findSet(secondNode);
//
//        DisjointSet.unionSet(firstNode,secondNode);
//        output.printAllNodeOfThisSet();
        Prims graph = new Prims(nodeList);
        graph.addWeightedUndirectedEdge(0,1,5);
        graph.addWeightedUndirectedEdge(0,2,14);
        graph.addWeightedUndirectedEdge(0,4,15);
        graph.addWeightedUndirectedEdge(1,2,10);
        graph.addWeightedUndirectedEdge(1,3,8);
        graph.addWeightedUndirectedEdge(2,3,6);
        graph.addWeightedUndirectedEdge(2,4,20);
        System.out.println("Running Prims algo");
        graph.prims(nodeList.get(4));
    }
}