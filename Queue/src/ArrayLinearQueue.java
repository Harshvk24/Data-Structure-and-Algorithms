public class ArrayLinearQueue {
    int [] arr;
    int topOfQueue;
    int beginningOfQueue;

    //creation
    public ArrayLinearQueue(int size){
        this.arr = new int [size];
        this.topOfQueue =-1;
        this.beginningOfQueue =-1;
        System.out.println("Queue successfully created with the size of "+ size);

    }

    //isEmpty
    public boolean isEmpty(){
        if ((beginningOfQueue==-1)||(beginningOfQueue== arr.length)){
            return true;
        }else {
            return true;
        }
    }


    //isFull
    public boolean isFull(){
        if(topOfQueue== arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    //enQueue
    public void enQueue(int value){
        if(isFull()){
            System.out.println("The queue is full");
        }
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue]= value;
            System.out.println("the value " + value + " is added successfully");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("the value " + value + " is added successfully");
        }
    }

    //deQueue
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        else{
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue){
                beginningOfQueue=-1;
                topOfQueue=-1;
            }
            return result;
        }
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        else {
            return arr[beginningOfQueue];
        }
    }

    //delete
    public void delete(){
        arr=null;
        System.out.println("Queue is successfully deleted");
    }
}
