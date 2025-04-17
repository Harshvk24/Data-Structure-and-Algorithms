import java.util.HashSet;

//delete Duplicate
public class Questions {
    void deleteDuplicate(LinkedList ll){
        HashSet<Integer> hs = new HashSet<>();
        Node curr = ll.head;
        Node prev = null;
        while (curr != null){
            int currVal=curr.value;
            if(hs.contains(currVal)){
                prev.next = curr.next;
                ll.size--;
            }else {
                hs.add(currVal);
                prev=curr;
            }
            curr = curr.next;
        }
    }
    //Return Nth to last
    Node nthToLast(LinkedList ll, int n){
        Node p1 = ll.head;
        Node p2 = ll.head;
        for(int i =0;i<n;i++){
            if(p2==null) return null;
            p2=p2.next;
        }
        while(p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }

    //partition
    LinkedList partition(LinkedList ll, int x){
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode!=null){
            Node next = currentNode.next;
            if (currentNode.value<x){
                currentNode.next=ll.head;
                ll.head = currentNode;
            }
            else{
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next=null;
        return ll;
    }

    //sum list
    LinkedList sumList(LinkedList l1,LinkedList l2){
        Node n1=l1.head;
        Node n2 = l2.head;
        int carry  = 0;
        LinkedList resultLL=new LinkedList();
        while(n1 != null || n2 != null){
            int result  =carry;
            if(n1!=null){
                result += n1.value;
                n1=n1.next;
            }
            if(n2!=null){
                result += n1.value;
                n2=n2.next;
            }
            resultLL.insertNode(result%10);
            carry = result/10;
        }
        return  resultLL ;
    }
    //intersection


    //1st helper function : get kth node
    Node getKthNode(Node head,int k){
        Node curr = head;
        while(k>0 && curr!=null){
            curr=curr.next;
            k--;
        }
        return curr;
    }

    //2nd helper function: Intersection Method
    Node findIntersection(LinkedList l1,LinkedList l2){
        if(l1.head==null || l2.head==null){
            return  null;
        }
        if(l1.tail!=l2.tail) return null;

        Node shorter = new Node();
        Node longer = new Node();
        if(l1.size > l2.size){
            longer = l1.head;
            shorter = l2.head;
        }
        else {
            longer = l2.head;
            shorter = l1.head;
        }
        longer = getKthNode(longer,Math.abs(l1.size-l2.size));
        while (shorter!=longer){
            shorter = shorter.next;
            longer=longer.next;
        }
        return longer;
    }

    //3rd helper function: Add same node
    void addSameNode(LinkedList l1, LinkedList l2, int nodeValue){
        Node newNode= new Node();
        newNode.value = nodeValue;
        l1.tail.next = newNode;
        l1.tail = newNode;
        l2.tail.next = newNode;
        l2.tail = newNode;
    }
}
