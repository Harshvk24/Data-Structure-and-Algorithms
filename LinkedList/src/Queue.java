public class Queue {
    SingleLinkList list;
    public Queue() {
        list = new SingleLinkList();
        System.out.println("the queue is successfully created");
    }

    //isEmpty
    public boolean isEmpty(){
        if(list.head==null){
            return true;
        }
        else {
            return false;
        }
    }

    //enQueue
    public void enQueue(int value){
        list.insertInLinkedList(value,list.size);
        System.out.println("successfully inserted value "+ value+" in queue");
    }

    //dequeue
    public int dequeue(){
        int value = -1;
        if(isEmpty()){
            System.out.println("queue is empty");
            return value;
        }
        else {
            value = list.head.value;
            list.deleteSingleLinkedList(0);
            return value;
        }
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else {
            return list.head.value;
        }
    }

    //delete (clear)
    public void delete(){
        list.head = null;
        list.tail=null;
        System.out.println("queue is successfully deleted");
    }
}
