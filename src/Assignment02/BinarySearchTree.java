package Assignment02;

import Models.Node;

public class BinarySearchTree {

    private Node _root;
    private long _size;

    /**
     * adds a new Node to this BinarySearchTree
     * 
     * @param data
     * @return bull if the data is already present in this BST.
     */
    public Boolean add(Integer data) {
        var result = this.addWork(_root, data);
        if (result == null) {
            return false;
        }
        _root = result;
        return true;
    }

    /**
     * The recursive method which actually does the work.
     * 
     * @param current
     * the current Node<T> being traversed.
     * @param data
     *  the data to add.
     * @return the new Node that was added to the BST.
     */
    private Node addWork(Node current, float data) {
        // If the BST is empty, this adds the root.
        if (current == null) {
            _size++;
            return new Node(data);
        } else if (data < current.getData()) {
            var leftChild = current.getLeftChild();
            leftChild = this.addWork(leftChild, data);
            current.setLeftChild(leftChild);

        } else if (data > current.getData()) {
            var rightChild = current.getRightChild();
            rightChild = this.addWork(rightChild, data);
            current.setRightChild(rightChild);
        } else {
            return null;
        }

        return current;
    }

    public void clear(){
        _root = null;
    }

    /** 
     * @return long
     */
    public long getSize() {
        return _size;
    }

    public Node getRoot(){
        return _root;
    }

    /** 
     * Searches for a node storing the provided value 
     * @param data
     * The data to search for
     * @return Node
     * Returns the corresponding node if it was found; otherwise null.
     */
    public Node search(int data){
        return this.searchWork(_root,data);
    }
   
    /** 
     * @param current
     * The current node being traversed.
     * @param  data 
     * The data to search for
     * @return Node
     * Returns the corresponding node if it was found; otherwise null.
     */
    private Node searchWork(Node current, int data) {
        if (_root == null) {
            return null;
        }

        if(current == null){
            return null;
        }

        if(data == current.getData()){
            return current;
        }

        else if (data < current.getData()) {
            var leftChild = current.getLeftChild();
            return searchWork(leftChild, data);
        }

        else if (data > current.getData()) {
            var rightChild = current.getRightChild();
            return searchWork(rightChild, data);
        }

        return current;
    }


    public Node removeWork(Node current,int data){
        if(_root == null){
            return false;
        }

        else if (data < current.getData()) {
            var leftChild = current.getLeftChild();
            if(leftChild!=null && leftChild.g)
            return searchWork(leftChild, data);
        }

        // This means that the node to remove does not exist!
        // if(node==null){
        //     return false;
        // }

        // if(!node.hasChildren()){

        // }


        // return true;

    }

}
