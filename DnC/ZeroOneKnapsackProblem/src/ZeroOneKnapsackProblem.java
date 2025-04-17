public class ZeroOneKnapsackProblem {
    private int knapsack(int[] profit,int[] weight, int capacity, int currIndex){
        if(capacity<=0 || currIndex<0|| currIndex>= profit.length){
            return 0;
        }
        int profit1=0;
        int profit2 =0;
        if(weight[currIndex]<=capacity){
            profit1= profit[currIndex]+ knapsack(profit,weight,capacity-weight[currIndex],currIndex+1);
           profit2 = knapsack(profit,weight,capacity,currIndex+1);
        }
        return Math.max(profit1,profit2);
    }
    public int knapsack(int[] profit,int[]weight, int capacity){
        return this.knapsack(profit,weight,capacity,0);
    }
}
