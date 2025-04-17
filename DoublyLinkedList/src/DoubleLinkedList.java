public class DoubleLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDLL(int nodeValue){
        head= new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value=nodeValue;
        newNode.next =null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size =1;
        return head;
    }

    //insert in dll

    public void insertDLL(int nodeValue,int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(head==null){
            createDLL(nodeValue);
            return;
        }

        else if(location==0){               //at head
            newNode.prev=null;
            newNode.next=head;
            head.prev=newNode;
            head = newNode;

        }
        else if (location>=size) {          //at end

            newNode.prev = tail;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;

        }
        else  {                             //at middle
            DoublyNode temp = new DoublyNode();
            temp=head;
            for(int i =0;i<location-1;i++){
                temp = temp.next;
            }
            newNode.prev = temp;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;

    }

    //transverse in DLL

    public void traverseDLL(){
        if(head == null){
            System.out.println("List not exist");
        }
        DoublyNode temp = new DoublyNode();
        temp=head;
        for(int i=0;i<size;i++){
            System.out.print(temp.value);

            if(i!= size-1){
                System.out.print("<->");
            }
            temp=temp.next;
        }
        System.out.println();
    }

    //reverse traverse

    public void reverseDLL(){
        if(size != 0){
            DoublyNode temp = new DoublyNode();
            temp=tail;
            for(int i=size-1;i>=0;i--){
                System.out.print(temp.value);

                if(i!= 0){
                    System.out.print("<->");
                }
                temp=temp.prev;
            }
            System.out.println();
        }
        else {
            System.out.println("List not exist");
        }
    }

    //Searching in dll

    public boolean searchDLL(int nodeValue){
        if(head!=null){
            DoublyNode temp = head;
            for(int i=0;i<size;i++){
                if(temp.value==nodeValue){
                    System.out.println("Node found at location "+ i);
                    return true;
                }
                temp=temp.next;
            }
            System.out.println("Node not found");
            return false;
        }
        else {
            System.out.println("List not exist");
            return false;
        }
    }

    //deletion in DLL

    public void deleteDLL(int location){
        if(head!=null){
            if(location==0){
                if(size==1){
                    head = null;
                    tail=null;
                    size--;

                }
                else {
                    head=head.next;
                    head.prev=null;
                    size--;

                }
            }
            else if(location>=size){
                DoublyNode temp = tail.prev;
                if(size==1){
                    head = null;
                    tail=null;
                    size--;

                }
                else{
                    temp.next=null;
                    tail= temp;
                    size--;
                }
            }
            else{
                DoublyNode temp = head;
                for(int i=0;i<location-1;i++){
                    temp=temp.next;
                }
                temp.next = temp.next.next;
                temp.next.prev = temp;
                size--;
            }
        }
    }

    //delete entire list

    public void clearDLL(){
        DoublyNode temp = head;
        for(int i=0;i<size-1;i++){
            temp.prev=null;
            temp=temp.next;
        }
        head=null;
        tail=null;
        System.out.println("The list is Deleted");
    }
}
