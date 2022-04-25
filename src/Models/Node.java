package Models;

public class Node {

    private float _data;
    private Node _rightChild;
    private Node _leftChild;

    public Node(float data) {

        _data = data;
    }

    /**
     * Gets the data stored in this Node<T>.
     * 
     * @return T
     */
    public float getData() {

        return _data;
    }

    public Boolean hasChildren(){
        if(this.getLeftChild()==null && this.getRightChild() ==null){
            return false;
        }
        return true;
    }

    /**
     * sets the data stored in this Node<T>.
     * 
     * @param data
     */
    public void setData(float data) {

        _data = data;
    }

    public void setLeftChild(Node data){

        _leftChild = data;
    }

    public void setRightChild( Node data){

        _rightChild = data;
    }

    /**
     * Gets the left child of this Node<T>.
     * If it does not gave a left child null is returned
     * instead.
     * 
     * @return Node<T>
     */
    public Node getLeftChild() {

        return _leftChild;
    }

    /**
     * Gets the right child of this Node<T>.
     * If it does not have a right child,
     * null is returned instead.
     * 
     * @return Node<T>
     */
    public Node getRightChild() {

        return _rightChild;
    }

}
