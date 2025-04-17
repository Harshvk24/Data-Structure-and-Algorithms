public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    //Create CSLL

    public Node createCSLL(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value= nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size =1;
        return head;
    }

    // Insertion

    public void insertCSLL(int nodeValue,int location){
        Node node = new Node();
        node.value= nodeValue;
        if(head==null){
            createCSLL(nodeValue);
            return;
        }
        if(location==0){        //at head
            node.next = head;
            head = node;
            tail.next= head;
        }
        else if(location>=size){ // at last
            tail.next = node;
            tail = node;
            tail.next=head;
        }
        else{                     //at middle
            Node temp = head;
            int index =0;
            while (index<location-1){
                temp = temp.next;
                index++;
            }
            node.next=temp.next;
            temp.next=node;
        }
        size++;
    }

    //traverse

    public void traverseCSLL(){
        if(head!=null) {
            Node temp = head;
            for (int i =0;i<size;i++){
                System.out.print(temp.value);
                if(i!=size-1){
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
        }
        else {
            System.out.println("List is Empty");
        }

    }

    //searching

    public boolean searchingCSLL(int nodeValue){
        if(head==null){
            System.out.println("List not exist");
        }
        Node temp = head;
        for(int i=0;i<size;i++){
            if(temp.value == nodeValue){
                System.out.println("Node Found at location "+ i);
                return true;
            }
            temp= temp.next;
        }
        System.out.println("Value not exist in list ");
        return false;

    }

    //deletions
    public void deleteCSLL(int location){
        if(head== null){
            System.out.println("List not exist");
            return;
        }

        else if(location==0){        //delete head
            head=head.next;
            tail.next = head;
            size--;
            if(size==0){
                head =null;
                tail = null;
                head.next=null;

            }
        }
        else if(location>=size){   //delete at end
            Node temp = head;
            for(int i=0;i<size-1;i++){
                  temp=temp.next;
            }
            if(temp==head){
                head.next=null;
                tail = head = null;
                size --;
                return;
            }
            temp.next=head;
            tail=temp;
            size--;
        }
        else{                       //delete at between
            Node temp = head;
            for (int i =0;i<location-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    //delete entire list
    public void clearCSLL(){
        if(head == null){
            System.out.println("list not exist" );
            return;
        }
        head=null;
        tail.next=null;
        tail = null;
        size =0;
        System.out.println("List is deleted");
    }
}
