//Traversal
//1.Preorder : 1st root node -> 2nd left Subtree - > 3rd right Subtree
//2.Inorder  : 1st left Subtree  -> 2nd root node -> 3rd right Subtree
//3.PostOrder: 1st left Subtree  -> 2nd right Subtree -> 3rd root node
//3.LevelOrder : 1st will be 1st level and so on...

import java.util.LinkedList; //  level order
import java.util.Queue; // level order
public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }

    //PreOrder traversal
    public void preOrder(BinaryNode node){
        if(node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //Inorder traversal
    void inOrder(BinaryNode node){
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);

    }

    //PostOrder Traversal
    void postOrder(BinaryNode node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    //LevelOrder traversal

    void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left!= null){
                queue.add(presentNode.left);
            }if(presentNode.right!= null){
                queue.add(presentNode.right);
            }
        }
    }

    //search method  using level order traversal
    public void search (String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                System.out.println("Value is found in the tree");
                return;
            }
            else {
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value not found in the tree");
    }

    //Insert node
    public void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if(root == null){
            root = newNode;
            System.out.println("Successfully inserted node at root ");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newNode;
                System.out.println("Successfully inserted");
                break;
            } else if (presentNode.right==null) {
                presentNode.right = newNode;
                System.out.println("Successfully inserted");
                break;
            }else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    //get deepest node
    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;  //deepest node
    }


    //Delete Deepest Node
    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left==null){
                previousNode.right=null;
                return;
            }else if(presentNode.right==null){
                presentNode.left=null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    //delete given node
    void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
           BinaryNode presentNode = queue.remove();
           if(presentNode.value == value){
               presentNode.value=getDeepestNode().value;
               deleteDeepestNode();
               System.out.println("The node is deleted");
               return;
           }
           else {
               if(presentNode.left!=null){
                   queue.add(presentNode.left);
               }
               if(presentNode.right!=null){
                   queue.add(presentNode.right);
               }
           }
        }
        System.out.println("Node does not exist in binary tree");
    }

    //delete entire binary tree
    void deleteBT(){
        root = null;
        System.out.println("Binary tree has been successfully deleted");
    }
}
