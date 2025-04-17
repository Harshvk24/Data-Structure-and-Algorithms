public class circularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    //create

    public DoublyNode createCDLL(int nodeValue){
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail= newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size=1;
        return head;
    }

    //insertion

    public void insertCDLL(int nodeValue,int location){
        if(head==null){
            createCDLL(nodeValue);
            return;
        }
        DoublyNode newNode = new DoublyNode();
        newNode.value=nodeValue;
        if(location==0) {               //at head
            newNode.next=head;
            newNode.prev = tail;
            head.prev= newNode;
            tail.next = newNode;
            head = newNode;
        }

        else if(location>=size){        //at tail
            newNode.prev=tail;
            newNode.next=head;
            head.prev = newNode;
            tail.next=newNode;
            tail= newNode;
        }
        else {                          //at middle
            DoublyNode temp = head;
            for (int i=0;i<location-1;i++){
                temp = temp.next;
            }
            temp.next.prev = newNode;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }
        size++;
    }

    //traverse

    public void traverseCDLL(){
        if(head!=null) {
            DoublyNode temp = head;
            for (int i = 0; i < size ; i++) {
                System.out.print(temp.value);
                temp = temp.next;
                if (i != size - 1) {
                    System.out.print("<->");
                }
            }
        }
        else {
            System.out.println("List not exist");
        }
        System.out.println();
    }

    //reverse traverse

    public void reverseCDLL(){
        if(head!=null) {
            DoublyNode temp = tail;
            for (int i = 0; i < size ; i++) {
                System.out.print(temp.value);
                temp = temp.prev;
                if (i != size - 1) {
                    System.out.print("<->");
                }
            }
        }
        else {
            System.out.println("List not exist");
        }
        System.out.println();
    }

    //searching

    public void searchCDLL(int nodeValue){
        if(head!=null){
            DoublyNode temp = head;
            for (int i = 0; i < size; i++) {
                if (temp.value == nodeValue) {
                    System.out.println("node found at location " + i);
                    return;
                }
                temp=temp.next;
            }
            System.out.println("Node not found");

        }
        else {
            System.out.println("List not exist");
        }
    }

    //deletion

    public void deleteCDLL(int location){
        if(head==null){
            System.out.println("list no exist");
            return;
        }
        else{
            if(location==0){
                if(size==1){
                    head.prev=null;
                    head.next=null;
                    head=null;
                    tail=null;
                }
                else{
                    head=head.next;
                    head.prev=tail;
                    tail.next=head;
                }
            }
            if(location>=size){
                if(size==1){
                    head.prev=null;
                    head.next=null;
                    head=null;
                    tail=null;
                }
                else {
                    tail=tail.prev;
                    tail.next=head;
                    head.prev=tail;
                }
            }
            else{
                DoublyNode temp = head;
                for (int i =0;i<location-1;i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                temp.next.prev = temp;
            }
            size--;
        }
    }

    //clear the list

    public void clearCDLL(){
        if(head==null){
            System.out.println("List no exist");
        }
        else {

            DoublyNode temp = head;
            for (int i =0;i<size;i++){
                temp.prev=null;
                temp=temp.next;
            }
            head =null;
            tail=null;
            System.out.println("List is deleted");
        }
    }
}
