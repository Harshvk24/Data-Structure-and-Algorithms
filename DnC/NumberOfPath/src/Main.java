public class Main {
    public static void main(String[] args) {
        int[][] arr={{4,7,1,6},{5,7,3,9},{3,2,1,2},{7,1,6,3}};
        int cost =25;
        NumberOfPath numberOfPath =new NumberOfPath();
        System.out.println(numberOfPath.numberOfPaths(arr,arr.length-1,arr[0].length-1,cost));
    }
}