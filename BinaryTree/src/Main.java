public class Main {

    // Represent Hierarchical data
    //each node has 2 components : data and a link to its sub categories
    //base category and sub categories under it
    //Tree Terminology:
    //Root
    //edge
    //leaf
    //sibling: children of same parent
    //ancestor
    //Depth of node: a length of the path from root to node
    // Height of node : a length of the path from the node to the deepest node
    //depth of tree: depth of root node
    //height of tree: height of root node
    public static void main(String[] args) {
        TreeNode drinks  = new TreeNode("Drinks");
        TreeNode hot  = new TreeNode("Hot");
        TreeNode cold  = new TreeNode("Cold");
        TreeNode tea  = new TreeNode("Tea");
        TreeNode coffee  = new TreeNode("Coffee");
        TreeNode vine  = new TreeNode("Vine");
        TreeNode beer  = new TreeNode("Beer");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(vine);
        cold.addChild(beer);
        System.out.println(drinks.print(0));

    }
}
