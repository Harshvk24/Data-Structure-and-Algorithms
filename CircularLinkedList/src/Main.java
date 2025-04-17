public class Main {

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        //System.out.println(csll.head.value);
        //System.out.println(csll.head.next.value);
        csll.insertCSLL(2,0);
        csll.insertCSLL(8,2);
        csll.insertCSLL(4,8);
        csll.traverseCSLL();
        System.out.println();
        csll.searchingCSLL(5);
    }
}
