public class Main {
    public static void main(String[] args) {
    ZeroOneKnapsackProblem zeroOneKnapsackProblem = new ZeroOneKnapsackProblem();
    int []profits={31,26,17,72};
    int[] weights = {3,1,2,5};
        System.out.println(zeroOneKnapsackProblem.knapsack(profits,weights,7));
    }
}