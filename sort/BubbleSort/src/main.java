public class main {
    public static void main(String[] args) {
        //compare adjecent item and the sort
        //tc = n^2
        //sc =1
        BubbleSort bs = new BubbleSort();
        int arr[] = {10 ,5, 7, 17 ,16,21};
        bs.bubbleSort(arr);
        bs.printArray(arr);
    }
}

