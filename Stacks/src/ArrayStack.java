public class ArrayStack {
    // using array
    //follow Last In First Out  - LIFO
    //operation
    //1.Create
    //2.push - insert
    //3.pop - remove
    //4.peek -show topmost element
    //5.isEmpty
    //6.isFull-- not make sense if we use linked list
    //7.deleteStack
    int[] arr;
    int topOfStack;

    public ArrayStack(int size){         // Creation odf stack
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is successfully created with size of "+size);
    }

    //isEmpty
    public boolean isEmpty(){
        if(topOfStack==-1){
//            System.out.println("Stack is empty");
            return true;
        }else {
//            System.out.println("Stack is not empty");
            return false;
        }
    }

    //isFull
    public boolean isFull(){
        if(topOfStack == arr.length-1){

            return true;
        }else{
            return false;
        }
    }

    // push
    public  void push(int value){
        if(isFull()){
            System.out.println("The Stack is full");
        }else{
            arr[topOfStack+1] = value;
            topOfStack ++;
            System.out.println("The value is successfully inserted");
        }
    }

    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        } else {
            int topStack =arr[topOfStack];
            topOfStack--;
            return topStack;
        }

    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    //delete method
    public void deleteStack(){
        arr = null;
        System.out.println("the stack is Successfully deleted");
    }


}

