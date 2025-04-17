import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode>{
    public String name;

    public ArrayList<WeightedNode> neighbours = new ArrayList<>();
    public HashMap<WeightedNode,Integer> weightMap = new HashMap<>();
    public boolean isVisited = false;
    public WeightedNode parent;
    public DisjointSet set;
    public int distance;


    public WeightedNode(String name){
        this.name =name;
        distance = Integer.MAX_VALUE;

    }
    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(WeightedNode o){
        return this.distance-o.distance;
    }
}
