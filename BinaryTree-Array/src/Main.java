public class Main {
    //index 0 is never used
    //left child = cell[2x]
    //right child = cell[2x+1]
    //fixed size array
    //last used index - which index used last(initially zero)
    public static void main(String[] args) {
        BinaryTree newBinaryTree = new BinaryTree(9);
        newBinaryTree.insert("n1");
        newBinaryTree.insert("n2");
        newBinaryTree.insert("n3");
        newBinaryTree.insert("n4");
        newBinaryTree.insert("n5");
        newBinaryTree.insert("n6");
        newBinaryTree.insert("n7");
        newBinaryTree.insert("n8");
        newBinaryTree.insert("n9");
        System.out.println();
        newBinaryTree.preOrder(1);
        System.out.println();
        newBinaryTree.inOrder(1);
        System.out.println();
        newBinaryTree.postOrder(1);
        System.out.println();
        newBinaryTree.levelOrder();
        System.out.println();
        newBinaryTree.search("n5");
    }
}
