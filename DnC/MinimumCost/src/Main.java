public class Main {
    public static void main(String[] args) {
    int arr[][] = {
            {4,7,8,6,4},
            {6,7,3,9,2},
            {3,8,1,2,4},
            {7,1,7,3,7},
            {2,9,8,9,3}
    };
    MinimumCostMatrix minimumCostMatrix = new MinimumCostMatrix();
        System.out.println(minimumCostMatrix.minCost(arr,arr.length-1,arr[0].length-1));
    }
}