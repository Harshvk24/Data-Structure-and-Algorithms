import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<KnapsackItem> items = new ArrayList<>();
        int[] values ={100,120,60};
        int[] weight = {20,30,10};
        int capacity =50;
        for (int i=0;i<values.length;i++){
            items.add(new KnapsackItem(i+1,values[i],weight[i]));
        }
        FractionalKnapsack.knapsack(items,capacity);
    }
}