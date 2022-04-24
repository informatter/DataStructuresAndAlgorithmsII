package Assignment02;

import Models.Node;

public class BinarySearchTree {

    private Node _root;
    private long _size;

    /**
     * adds a new Node to this BinarySearchTree
     * 
     * @param data
     * @return false if the data is already present
     *         in this BST.
     */
    public Node add(Integer data) {
        var result = this.addWork(_root, data);
        if (result == null) {
            return null;
        }
        _root = result;
        return result;
    }

    /**
     * The recursive method which actually does the work.
     * 
     * @param current
     *                the current Node<T> being traversed.
     * @param data
     *                the data to add.
     * @return the new Node<T> that was added to this BST.
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
     * @param data
     * @return Boolean
     */
    public Boolean search(int data){
        return this.searchWork(_root,data);
    }
   
    /** 
     * @param current
     * @param data
     * @return Boolean
     */
    private Boolean searchWork(Node current, int data) {
        if (_root == null) {
            return false;
        }

        if(current == null){
            return false;
        }

        if(data == current.getData()){
            return true;
        }

        else if (data < current.getData()) {
            var leftChild = current.getLeftChild();
            return searchWork(leftChild, data);
        }

        else if (data > current.getData()) {
            var rightChild = current.getRightChild();
            return searchWork(rightChild, data);
        }

        return false;
    }

}
