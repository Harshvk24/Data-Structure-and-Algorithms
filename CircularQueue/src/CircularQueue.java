public class CircularQueue {

    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue(int size){
        this.arr = new int[size];
        this.topOfQueue=-1;
        this.beginningOfQueue=-1;
        this.size=size;
        System.out.println("The Circular queue is successfully created with size of "+ size);
    }

    //isEmpty
    public boolean isEmpty(){
        if(beginningOfQueue==-1 ) return true;
        else {
            return false;
        }
    }

    //isFull
    public boolean isFull(){
        if(topOfQueue+1==beginningOfQueue){
            return true;
        }else if(beginningOfQueue==0 && topOfQueue+1 ==size){
            return true;
        }
        else{
            return false;
        }
    }
    
    //enQueue
    public void enQueue (int value){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue ++;
            arr[topOfQueue] = value;
            System.out.println("the value "+value+" successfully inserted");
        }
        else {
            if(topOfQueue+1==size){
                topOfQueue=0;
            }else {
                topOfQueue++;
            }
            arr[topOfQueue]=value;
            System.out.println("the value "+value+" successfully inserted");

        }
    }

    //deQueue
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            int result=arr[beginningOfQueue];
            arr[beginningOfQueue]=0;
            if(beginningOfQueue == topOfQueue){
                beginningOfQueue =-1;
                topOfQueue =-1;
            } else if (beginningOfQueue+1 == size) {
                beginningOfQueue=0;
            }
            else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    //peek

    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            return arr[beginningOfQueue];
        }
    }

    //delete
    public void delete(){
        arr = null;
        System.out.println( "queue successfully deleted");
    }
}
