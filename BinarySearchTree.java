public class BinarySearchTree<T extends Comparable<T>> {
    private NodeType<T> root;

    // Initialize tree
    public BinarySearchTree() {

    } // BinarySearchTree

    //pre condition: tree is initialized
    // insert node with value of key into the tree. check for dupes
    public void insert(T key) {

    } // insert

    //pre condition: tree is initialized
    //
    // post condition: remove node with key value equal to parameter.
    // if not present leave tree unchanged
    // replace deleted node
    public void delete(T key) {

    } // delete

    //pre condtion: tree,  item, and found are all initialized
    //
    // post condition: item should refer to a key of a Node n in the tree
    // where the value of n.key is equal to the value of item. return true if n exists.
    public boolean search(T item) {

    } // search

    //pre condition: tree has been initialized
    //
    // post condition: print out the tree in in-order.
    // "The function prototype does not include a parameter, so you can implement
    //  this by using as auxiliary function or using a getRoot function etc" - whatever this means
    public void inOrder() {

    } // inOrder


    //we can implement the rest of the methods however we want

    // prints nodes that have one child
    public void getSingleParent() {

    } // getSingleParent

    //count the number of leaf nodes and output the count
    public void getNumLeafNodes() {

    } // getNumLeafNodes

    // takes in a node as input and prints the cousins of the given node.
    public void getCousins(NodeType node) {

    } // getCousins
} // BinarySearchTree
