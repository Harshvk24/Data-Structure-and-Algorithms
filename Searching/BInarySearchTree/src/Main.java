public class Main {
    public static void main(String[] args) {
        BinarySearchTree newBT = new BinarySearchTree();
        newBT.insert(70);
        newBT.insert(50);
        newBT.insert(90);
        newBT.insert(30);
        newBT.insert(60);
        newBT.insert(80);
        newBT.insert(100);
        newBT.insert(20);
        newBT.insert(40);

        newBT.preOrder(newBT.root);
        System.out.println();
        newBT.inOrder(newBT.root);
        System.out.println();
        newBT.postOrder(newBT.root);
        System.out.println();
        newBT.levelOrder();
        System.out.println();
        newBT.search(newBT.root, 84);
        newBT.deleteNode(newBT.root,90);
        newBT.levelOrder();
    }

    //delete entire tree

}
