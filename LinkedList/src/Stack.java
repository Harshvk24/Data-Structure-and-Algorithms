public class Stack {
    SingleLinkList linkedlist;

    public Stack(){
        linkedlist = new SingleLinkList();
    }

    //push
    public void push (int value){
        linkedlist.insertInLinkedList(value,0);
        System.out.println("Inserted "+value+" in stack");
    }

    //isEmpty
    public boolean isEmpty(){
        if(linkedlist.head==null){
            return true;
        }
        else {
            return false;
        }
    }

    //pop
    public int pop(){
        int result=-1;
        if(isEmpty()){
            System.out.println("Stack is empty");

        } else{
            result = linkedlist.head.value;
            linkedlist.deleteSingleLinkedList(0);
        }
        return result;
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            return linkedlist.head.value;
        }
    }

    //delete
    public void deleteStack(){
        linkedlist.head = null;
        System.out.println("Stack is deleted");
    }
}
