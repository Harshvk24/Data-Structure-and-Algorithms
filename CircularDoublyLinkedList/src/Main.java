public class Main {
    public static void main(String[] args) {
        circularDoublyLinkedList cdll = new circularDoublyLinkedList();
        cdll.createCDLL(5);
        cdll.insertCDLL(4,1);
        cdll.insertCDLL(7,0);
        cdll.insertCDLL(8,6);
        cdll.traverseCDLL();
        cdll.reverseCDLL();
        cdll.searchCDLL(4);
    }
}
