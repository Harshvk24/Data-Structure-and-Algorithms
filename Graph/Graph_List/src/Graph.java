import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

public Graph(ArrayList<GraphNode> nodeList){
    this.nodeList = nodeList;
}
public void addUndirectedEdge(int i ,int j){
    GraphNode first = nodeList.get(i);
    GraphNode second = nodeList.get(j);
    first.neighbours.add(second);
    second.neighbours.add(first);
}


    public  String toString(){
        StringBuilder s = new StringBuilder();
        for (int i =0;i<nodeList.size();i++) {
            s.append(nodeList.get(i).name + ":");
            for (int j = 0; j < nodeList.get(i).neighbours.size(); j++) {
                if (j == nodeList.get(i).neighbours.size() - 1) {
                    s.append(nodeList.get(i).neighbours.get(j).name);
                } else {
                    s.append((nodeList.get(i).neighbours.get(j).name) + "->");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

    //BFS internal
    void bfsVisit(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(node);
        while (!queue.isEmpty()){
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name+" ");
            for (GraphNode neighbour: currentNode.neighbours){
                if(neighbour.isVisited==false){
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }

    }

    void bfs(){
    for (GraphNode node : nodeList){
        if(!node.isVisited){
            bfsVisit(node);
            }
        }
    }
    //dfs internal
    void dfsVisit(GraphNode node){
        Stack<GraphNode> stack = new Stack<GraphNode>();
        stack.push(node);
        while (!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name +" ");
            for (GraphNode neighbour : currentNode.neighbours){
                if(!neighbour.isVisited){
                    stack.push(neighbour);
                    neighbour.isVisited = true;
                }
            }

        }
    }

    //dfs
    void dfs(){
        for (GraphNode node: nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }

    //topological sort
    public void addDirectedEdge(int i ,int j){
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
    }

    void topologicalVisit(GraphNode node,Stack<GraphNode> stack){
        for (GraphNode neighbour: node.neighbours){
            if(!neighbour.isVisited){
                topologicalVisit(neighbour,stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }

    void topologicalSort(){
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node:nodeList){
            if(!node.isVisited){
                topologicalVisit(node,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop().name+" ");
        }
    }

    //for single source  Shortest path problem(SSSPP)
    public static void pathPrint(GraphNode node){
        if(node.parent !=null){
            pathPrint(node.parent);
        }
        System.out.print(node.name +" ");
    }

    public void BFSforSSSPP(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            GraphNode current = queue.remove(0);
            current.isVisited = true;
            System.out.print(" printing path ofr node"+current.name+": ");
            pathPrint(current);
            System.out.println();
            for (GraphNode neighbour: current.neighbours){
                if(!neighbour.isVisited){
                    queue.add(neighbour);
                    neighbour.isVisited=true;
                    neighbour.parent=current;
                }
            }
        }
    }

}
