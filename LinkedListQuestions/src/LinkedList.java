public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next=null;
        head = newNode;
        tail= newNode;
        size=1;
    }
    //insert end
    public void insertNode(int nodeValue){
        if(head==null){
            createLL(nodeValue);
            return;
        }
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next=null;
        tail.next = newNode;
        tail=newNode;
        size++;
    }

    //traverse
    public void traverse(){
        Node temp = head;
        for(int i =0;i<size;i++){
            System.out.print(temp.value);
            if(i!=size-1){
                System.out.print(" -> ");
            }
            temp=temp.next;
        }
        System.out.println();
    }
}
