import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
        adjacencyMatrix= new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirected(int i,int j){
        adjacencyMatrix[i][j]= 1;
        adjacencyMatrix[j][i]= 1;
    }

    public  String toString(){
        StringBuilder s = new StringBuilder();
        s.append("  ");
        for (int i =0;i<nodeList.size();i++){
            s.append(nodeList.get(i).name+" ");
        }
        s.append("\n");
        for (int i =0;i<nodeList.size();i++){
            s.append(nodeList.get(i).name+":");
            for (int j:adjacencyMatrix[i]){
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    //Getting Neighbours
    public ArrayList<GraphNode> getNeighbour(GraphNode node){
        ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();
        int nodeIndex = node.index;
        for (int i =0;i<adjacencyMatrix.length;i++){
            if(adjacencyMatrix[nodeIndex][i]==1){
                neighbours.add(nodeList.get(i));

            }
        }
        return neighbours;
    }

    //BFS internal
    void bfsVisit(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(node);
        while (!queue.isEmpty()){
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.println(currentNode.name+" ");
            ArrayList<GraphNode> neighbours = getNeighbour(currentNode);
            for(GraphNode neighbour: neighbours){
                if(!neighbour.isVisited){
                    queue.add(neighbour);
                    neighbour.isVisited=true;
                }
            }
        }
    }

    public void bfs(){
        for (GraphNode node : nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }

    //DFS internal
    public void dfsVisit(GraphNode node){
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name+" ");
            ArrayList<GraphNode> neighbours = getNeighbour(currentNode);
            for (GraphNode neighbour : neighbours){
                if(!neighbour.isVisited);{
                    stack.push(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    //dfs
    public void dfs(){
        for (GraphNode node:nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }

    //Topological sort
   public void addDirectedEdge(int i ,int j){
        adjacencyMatrix[i][j] = 1;
   }

   public void topologicalVisit(GraphNode node,Stack<GraphNode> stack){
        ArrayList<GraphNode> neighbours = getNeighbour(node);
        for (GraphNode neighbour:neighbours){
            if(!neighbour.isVisited){
                topologicalVisit(neighbour,stack);
            }
        }
        node.isVisited=true;
        stack.push(node);
   }

   void topologicalSort(){
        Stack<GraphNode> stack = new Stack<>();
        for(GraphNode node:nodeList){
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
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited=true;
            System.out.print("printing path for node "+currentNode.name+" : ");
            pathPrint(currentNode);
            System.out.println();

            ArrayList<GraphNode> neighnbours = getNeighbour(currentNode);
            for(GraphNode neighbour : neighnbours){
                if(!neighbour.isVisited){
                    queue.add(neighbour);
                    neighbour.isVisited=true;
                    neighbour.parent = currentNode;
                }
            }
        }
    }
}
