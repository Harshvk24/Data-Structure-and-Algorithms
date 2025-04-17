import java.util.ArrayList;
import java.util.PriorityQueue;
public class WeightedGraph {
    ArrayList<WeightedNode> nodeList =new ArrayList<>();

    public WeightedGraph(ArrayList<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }


    public static void pathPrint(WeightedNode node){
        if(node.parent !=null){
            pathPrint(node.parent);
        }
        System.out.print(node.name +" ");
    }
    public void addWeightedEdge(int i,int j, int d){
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbours.add(second);
        first.weightMap.put(second,d);
    }

    //bellman
    void bellmanFord(WeightedNode sourceNode){
        sourceNode.distance=0;
        for(int i=0;i<nodeList.size();i++){
            for (WeightedNode currentNode:nodeList){
                for (WeightedNode neighbour:currentNode.neighbours){
                    if(neighbour.distance>currentNode.distance+currentNode.weightMap.get(neighbour)){
                        neighbour.distance=(currentNode.distance+currentNode.weightMap.get(neighbour));
                        neighbour.parent = currentNode;
                    }
                }
            }
        }
        System.out.println("Checking for negative cycle..");
        for (WeightedNode currentNode:nodeList){
            for (WeightedNode neighbour: currentNode.neighbours){
                if(neighbour.distance>currentNode.distance+currentNode.weightMap.get(neighbour)){
                    System.out.println("There is a negative cycle found");
                    System.out.println();
                    System.out.println("vertex name: "+neighbour.neighbours);
                    System.out.println("old cost: "+ neighbour.distance);
                    int nedDistace = currentNode.distance+currentNode.weightMap.get(neighbour);
                    System.out.println("new cost: "+nedDistace);
                    return;
                }
            }
        }
        System.out.println("No negative cycle0\n");
        for (WeightedNode nodeToCheck: nodeList){
            System.out.print("Node "+ nodeToCheck+ ", distance: "+nodeToCheck.distance+" ,path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }
}
