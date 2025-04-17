public class Main {
    public static void main(String[] args) {
        //Divide and Conquer
        //TC = nlogn
        //sc = n
        int arr[] = {10 ,5, 7, 17 ,16,21,20,4,1};
        MergeSort.mergeSort(arr,0, arr.length-1);
        MergeSort.printArray(arr);

    }
}
