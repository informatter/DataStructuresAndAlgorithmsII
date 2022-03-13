package Models;

public class Node<T> {

    private T _data;
    private Node<T> _rightChild;
    private Node<T> _leftChild;

    public Node(T data) {

        _data = data;
    }

    /**
     * Gets the data stored in this Node<T>.
     * 
     * @return T
     */
    public T getData() {

        return _data;
    }

    /**
     * sets the data stored in this Node<T>.
     * 
     * @param data
     */
    public void setData(T data) {

        _data = data;
    }

    /**
     * Gets the left child of this Node<T>.
     * If it does not gave a left child null is returned
     * instead.
     * 
     * @return Node<T>
     */
    public Node<T> getLeftChild() {

        return _leftChild;
    }

    /**
     * Gets the right child of this Node<T>.
     * If it does not have a right child,
     * null is returned instead.
     * 
     * @return Node<T>
     */
    public Node<T> getRightChild() {

        return _rightChild;
    }

}
