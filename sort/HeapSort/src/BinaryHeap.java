public class BinaryHeap {

    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size){
        arr = new int[size+1];
        this.sizeOfTree=0;
        System.out.println("Binary heap has been created");
    }

    //peek of heap -> root of heap
    public boolean isEmpty(){
        if(sizeOfTree==0) return true;
        else return false;

    }

    public Integer peek(){
        if(isEmpty()){
            System.out.println("Binary heap is empty");
            return null;
        }
        return arr[1];
    }
    //size of heap = no of element in heap
    public int sizeOfHeap(){
        return sizeOfTree;
    }

    //traversal in Binary Heap -> level order
    public void traversal(){
        for (int i =1;i<=sizeOfTree;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    //Heapify method for insert
    public void heapifyBottomToTop(int index, String heapType) {
        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        if (heapType == "Min") {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (heapType == "Max") {
            if (arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomToTop(parent,heapType);
    }
    //insert method
    public void insert(int value,String typeHeap){
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree,typeHeap);
        System.out.println("value successfully inserted");
    }

    //Extract a node
    //heapify form top to bottom

    public void heapifyTopToBottom(int index, String heapType){
        int left = index*2;
        int right = index*2+1;
        int swapChild = 0;
        if (sizeOfTree<left) {
            return;
        }
        if (heapType == "Min") {
            if(sizeOfTree==left){ //only 1 child
                if(arr[index]>arr[left]){
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            }else {
                if(arr[left]<arr[right]){
                    swapChild=left;
                }else {
                    swapChild=right;
                }
                if(arr[index]>arr[swapChild]){
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        } else if (heapType == "Max") {
            if(sizeOfTree==left){ //only 1 child
                if(arr[index]<arr[left]){
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            }else {
                if(arr[left]>arr[right]){
                    swapChild=left;
                }else {
                    swapChild=right;
                }
                if(arr[index]<arr[swapChild]){
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }
        heapifyTopToBottom(swapChild,heapType);
    }

    //extract head of method
    public int extractHeadOfBH(String heapType){
        if(isEmpty()) return -1;
        else {
            int extractedValue = arr[1];
            arr[1]=arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1,heapType);
            return extractedValue;
        }
    }

    //delete binary heap
    public void deleteBH(){
        arr = null;
        System.out.println("Binary heap is successfully deleted");
    }
}
