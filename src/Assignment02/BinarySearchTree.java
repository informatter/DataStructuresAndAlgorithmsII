package Assignment02;
import Models.Node;

public class BinarySearchTree<T extends Comparable<? super T>>  {

    private Node<T> _root;
    private int _size;
    
    /** 
     * adds a new Node to this BinarySearchTree
     * @param data
     * @return false if the data is already present
     * in this BST.
     */
    public Boolean add(T data) {

        var result = this.addWork(_root, data);
        if(result == null) {return false;};
        _root = result;
        return true;
    }

    
    /** 
     * The recursive method which actually does the work.
     * @param current 
     * the current Node<T> to being traversed.
     * @param data 
     * the data to add.
     * @return the new Node<T> that was added to this BST.
     */
    private Node<T> addWork(Node<T> current, T data) {

        if (current == null) {
            _size++;
            return new Node<T>(data);
        }

        //if(a[beginHalf1].compareTo(a[beginHalf2]) <= 0)
        else if (current.getData() < data) {
            var leftChild = current.getLeftChild();
            leftChild = this.addWork(leftChild, data);
        }

        else if (current.getData() > data) {
            var rightChild = current.getRightChild();
            rightChild = this.addWork(rightChild, data);
        }

        else {return null;}

        return current;
    }

    // public Boolean search(T data)

}
