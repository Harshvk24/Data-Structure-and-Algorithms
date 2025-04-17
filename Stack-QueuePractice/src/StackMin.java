public class StackMin {
    Node top;
    Node min;

    public StackMin(){
        top = null;
        min = null;
    }

    //min method
    public int min(){
        return min.value;
    }

    //push
    public void push(int value){
        if(min == null){
            min = new Node(value,min);
        }
        else if (min.value < value){
            min = new Node(min.value,min);
        }else {
            min = new Node(value,min);
        }
        top = new Node(value,top);
    }

    //pop
    public int pop(){
        min = min.next;
        int result =top.value;
        top = top.next;
        return result;
    }
}
