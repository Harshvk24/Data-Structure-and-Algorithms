public class Main {
    public static void main(String[] args) {

        //divide 2 parts :sorted and unsorted
        //from unsorted array find correct position of 1st element
        //TC:n^2
        //SC:1
        int arr[] = {10 ,5, 7, 17 ,16,21};
        InsertionSort.insertionSort(arr);
        InsertionSort.printArray(arr);
    }
}
