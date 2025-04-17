public class SingleLinkList {



    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail =node;
        size =1;
        return head;
    }
    // Insert method
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head== null){
            createSinglyLinkedList(nodeValue); // null list
            return;
        }
        else if(location==0){
            node.next=head;         // at head
            head = node;
        }
        else if(location>=size){
            node.next = null;       //at last
            tail.next = node;
            tail= node;
        }
        else{
            Node tempNode = head;   // at middle
            int index =0;
            while (index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    //traversal method
    public void traverseSingleLinkedList(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else {
            Node temp =head;
            for(int i =0;i<size;i++){
                System.out.print(temp.value);
                if(i!=size-1){
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
        }
        System.out.println();

    }

    //Searching in Linked List

    public boolean searchSingleLinkedList(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i =0;i<size;i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Found at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    //Delete node
    public void deleteSingleLinkedList(int location){
        if(head== null){
            System.out.println("The List does not exist");

        }
        else if( location==0){ // deletion at head
            if(size ==1){       // if size=1
                head = null;
                tail =null;
                size =0;
            }
            else{               //if size >1
                head=head.next;
                size--;
            }
        }
        else if (location>=size){ // if deletion at last location
            Node temp = head;
            for (int i =0;i<size-1;i++){
                temp= temp.next;
            }
            if(temp==head){
                tail = head =null;
                size--;
                return;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
        else {                  //deletion between linked list
            Node temp = head;
            for (int i =0;i<location-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    // deleting entire linked list
    public void clearingSingleLinkedList(){
          head=null;
          tail = null;
        System.out.println("List is deleted" );
    }

}
