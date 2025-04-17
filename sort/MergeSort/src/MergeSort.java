public class MergeSort {

    //helper function
    static void merge(int[] a, int left,int middle,int right){ //left.>leftIndex right -> rightIndex
        int [] leftTempArray = new int[middle - left +2];
        int [] rightTempArray = new int[right-middle +1];
        for(int i=0;i<middle - left+1 ;i++){
            leftTempArray[i] = a[left+i];
        }
        for(int i=0;i<right-middle;i++){
           rightTempArray[i] = a[middle+i+1];
        }

        leftTempArray[middle - left+1]=Integer.MAX_VALUE;
        rightTempArray[right-middle ]=Integer.MAX_VALUE;
        int i=0,j=0;
        for(int k =left;k<=right;k++){
            if(leftTempArray[i]< rightTempArray[j]){
                a[k]= leftTempArray[i];
                i++;
            }else {
                a[k] = rightTempArray[j];
                j++;
            }
        }
    }

    public static void mergeSort(int[] array , int left,int right){
        if(right>left){
            int m= (left+right)/2;
            mergeSort(array,left,m);
            mergeSort(array,m+1,right);
            merge(array,left,m,right);
        }
    }

    public static void printArray(int [] arr){
        for(int j=0;j< arr.length;j++){
            System.out.print(arr[j]+ " ");
        }
    }
}
