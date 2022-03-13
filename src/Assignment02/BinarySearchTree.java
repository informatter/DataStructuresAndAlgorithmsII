package Assignment02;

import Models.Node;

public class BinarySearchTree<T extends Comparable<? super T>> {

    private Node<T> _root;

    public Boolean add(T data) {

        if (_root == null) {

            _root = new Node<T>(data);

            return true;
        }

        return false;

    }

    private void addWork(Node<T> node) {

        Node<T> current = null;
        if (node.getLeftChild() == null && node.getRightChild() == null)
            current = _root;

        else
            current = node;

        if (node.getData() < current.getData()) {

            var left = current.getLeftChild();

            if (left == null) {

                current.setLeftChild(node);

                return;
            }

            // current = left;

            addWork(left);

        }

        if (node.getData() > current.getData()) {

            var right = current.getRightChild();

            if (right == null) {

                current.setRightChild(node);

                return;
            }

            addWork(right);
        }

    }

    // public Boolean search(T data)

}
