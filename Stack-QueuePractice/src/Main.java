public class Main {
    //Three in one
//    public static void main(String[] args) {
//        ThreeInOne newStack = new ThreeInOne(3);
//        System.out.println(newStack.isFull(0));
//        System.out.println(newStack.isEmpty(2));
//        newStack.push(0,1);
//        newStack.push(0,2);
//        newStack.push(1,4);
//        newStack.push(1,5);
//        newStack.push(2,8);
//        System.out.println(newStack.pop(0));
//        System.out.println(newStack.pop(1));
//        System.out.println(newStack.pop(2));
//
//    }


    //Stack min
    public static void main(String[] args) {
        StackMin newSack = new StackMin();
        newSack.push(3);
        newSack.push(5);
        newSack.push(6);
        newSack.push(2);
        System.out.println(newSack.min());
        newSack.pop();
        System.out.println(newSack.min());
    }
}
