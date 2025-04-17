public class InsertionSort {


    public static void insertionSort(int[] arr){
        for(int i =1;i< arr.length;i++){
            int temp = arr[i];
            int j =i;
            while (j>0  && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
    public static void printArray(int [] arr){
        for(int j=0;j< arr.length;j++){
            System.out.print(arr[j]+ " ");
        }
        System.out.println();
    }
}
