public class Main {
    public static void main(String[] args) {
        //find min element and swap to left edge element
        //TC : n^2
        //SC : 1

        int arr[] = {10 ,5, 7, 17 ,16,21};
        SelectionSort.selectionSort(arr);
        SelectionSort.printArray(arr);
    }
}
