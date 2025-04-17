public class BinaryTree {
    public String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size){
        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Blank tree of size "+size+" has been created");
    }

    //isFull
    boolean isFull(){
        if(arr.length-1 == lastUsedIndex){
            return true;
        }
        else return false;
    }

    //insertion
    void insert(String value){
        if(!isFull()){
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("the value "+value+ " has been inserted");
        }
        else {
            System.out.println("Binary tree is full");
        }
    }

    //preOrder traversal
    void preOrder(int index){
        if(index>lastUsedIndex) return;
        System.out.print(arr[index]+ " ");
        preOrder(2*index);
        preOrder(2*index+1);
    }

    //InOrder
    void inOrder(int index){
        if(index>lastUsedIndex) return;
        inOrder(2*index);
        System.out.print(arr[index]+ " ");
        inOrder(2*index+1);
    }

    //PostOrder
    void postOrder(int index){
        if(index>lastUsedIndex) return;
        postOrder(2*index);
        postOrder(2*index+1);
        System.out.print(arr[index]+ " ");
    }
    //level traversal
    public void levelOrder(){
        for(int i =1;i<=lastUsedIndex;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    //search method
    int search(String value){
        for(int i =1;i<=lastUsedIndex;i++){
            if(arr[i]==value){
                System.out.print("Node is found at index "+i);
                return i;
            }
        }
        System.out.println("Value does not exist in binary tree");
        return -1;
    }

    //delete a node
    void deleteNode(String value){
        int location = search(value);
        if(location == -1) return;
        else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The node successfully deleted");
        }
    }

    //delete a binary tree
    void deleteBT(){
        try{
            arr = null;
            System.out.println("The binary tree is deleted");
        }catch (Exception e){
            System.out.println("there is an error in deleting the tree");
        }
    }

}
