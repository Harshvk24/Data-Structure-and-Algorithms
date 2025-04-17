public class Main {

    //select pivot generally right most
    //arrange such that less than pivot is at left and greater than pivot will be at right
    //do again with remaining array
    //TC = nlogn
    //SC = n

    public static void main(String[] args) {
        int[] arr ={4,2,6,14,23,21,5,6};
        QuickSorting q = new QuickSorting();
        q.quickSort(arr,0,arr.length-1);
        q.printArray(arr);
    }
}
