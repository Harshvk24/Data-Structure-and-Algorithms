import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;

    BinarySearchTree(){
        root = null;
    }

    //insertion
    private BinaryNode insert(BinaryNode currentNode,int value){
        if(currentNode == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("Value successfully inserted");
            return newNode;
        }
        else if(value <= currentNode.value) {
            currentNode.left = insert(currentNode.left,value);
            return currentNode;
        }
        else {
            currentNode.right = insert(currentNode.right,value);
            return currentNode;
        }

    }

    void insert(int value){
        root  = insert(root,value);
    }

    //preOrder
    void preOrder(BinaryNode node){
        if(node ==null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);

    }
    //Inorder
    void inOrder(BinaryNode node){
        if(node ==null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    //postOrder
    void postOrder(BinaryNode node){
        if(node ==null) return;
        postOrder(node.left);

        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    //Level Order
    void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode present = queue.remove();
            System.out.print(present.value+" ");
            if(present.left!=null){
                queue.add(present.left);
            }
            if(present.right!=null){
                queue.add(present.right);
            }
        }
    }

    BinaryNode search(BinaryNode node, int value){
        if(node==null){
            System.out.println("Value "+ value+" is not fount ");
            return null;
        }
        else if(node.value==value){
            System.out.println("Value "+ value+" is fount ");
            return node;
        }
        else if(value< node.value){
            return search(node.left,value);
        }
        else {
            return search(node.right,value);
        }
    }

    //delete node
    //1.find successor - min element in right child
    private static BinaryNode minNode(BinaryNode root) {
        if (root.left == null) return root;


        else {
            return minNode(root.left);
        }
    }
    //2-delete
    public static BinaryNode deleteNode(BinaryNode root,int value){
        if(root==null){
            System.out.println("Value not found at BST");
            return null;
        }
        if(value< root.value){
           root.left= deleteNode(root.left,value);
        }
        else if(value> root.value) {
            root.right = deleteNode(root.right,value);
        }
        else {
            //1case if node has 2 child
            if(root.left !=null && root.right!=null){
                BinaryNode temp = root;
                BinaryNode minNode = minNode(temp.right);
                root.value = minNode.value;
                root.right= deleteNode(root.right,minNode.value);
            }else if(root.left!=null){
                root = root.left;

            } else if (root.right!=null) {
                root = root.right;
            }else {
                root = null;
            }
        }
        return root;
    }
    void deleteBST(){
        root =null;
        System.out.println("BST is deleted successfully");
    }
}
