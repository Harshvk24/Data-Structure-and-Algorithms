public class Main {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
//        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(7);
//        stack.push(3);
        System.out.println("Element which is removed is "+stack.pop());
        System.out.println("Element at top is "+stack.peek());
    }
}
