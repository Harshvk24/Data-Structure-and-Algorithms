public class ThreeInOne {

    private int numberOfStacks = 3;
    private  int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize){
        stackCapacity = stackSize;
        values = new int[stackSize*numberOfStacks];
        sizes = new int[numberOfStacks];

    }

    public boolean isFull(int stackNumber){
        if(sizes[stackNumber]==stackCapacity){
            return true;
        }
        else {
            return false;
        }
    }

    //isEmpty
    public boolean isEmpty(int stackNumber){
        if(sizes[stackNumber]==0){
            return true;
        }else {
            return false;
        }
    }
    // indexOfTop
    private int indexOfTop(int stackNumber){
        int offset = stackNumber * stackCapacity;
        int size = sizes[stackNumber];
        return offset + size-1;

    }
    //push
    public void push(int stackNumber,int value){
        if(isFull(stackNumber)){
            System.out.println("The stack is full");
        }
        else {
            sizes[stackNumber]++;
            values[indexOfTop(stackNumber)]= value;
        }
    }

    //pop
    public int pop (int stackNumber){
        if(isEmpty(stackNumber)){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int topIndex = indexOfTop(stackNumber);
            int value = values[topIndex];
            values[topIndex]=0;
            sizes[stackNumber]--;
            return value;
        }
    }

    //peek
    public int peek(int stackNumber){
        if(isEmpty(stackNumber)){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            int topIndex = indexOfTop(stackNumber);
            return values[topIndex];
        }
    }
}
