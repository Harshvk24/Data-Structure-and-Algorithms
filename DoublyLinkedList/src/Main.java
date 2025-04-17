public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.createDLL(5);
        dll.insertDLL(1,0);
        dll.insertDLL(3,1);
        dll.insertDLL(4,7);
        dll.traverseDLL();
        //dll.reverseDLL();
        //dll.searchDLL(3);
        //dll.searchDLL(10);
        dll.deleteDLL(1);
        dll.traverseDLL();
    }
}
