public class Main {
    // follow FIFO
    //operations
    //1.create
    //2.enqueue - adding at last
    //3.dequeue - removing at first
    //4.peek
    //5.isEmpty
    //6.isFull
    //7.deleteQueue

    public static void main(String[] args) {
        ArrayLinearQueue queue = new ArrayLinearQueue(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
    }

}
