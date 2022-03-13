package Assignment01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Models.Node;

/**
 * All traversals are O(n).
 */
public class TreeTraversals<T extends Comparable<? super T>> {

    /**
     * @param node
     *             Initially this node represents the root of the tree.
     * @return List<T>
     *         returns all the values in the tree in ascending
     *         order if and only if the tree is a BST.
     */
    public List<T> InOrder(Node<T> node) {

        var output = new ArrayList<T>();

        this.InOrderWork(node, output);

        return output;

    }

    /**
     * @param node
     *             Initially this node represents the root of the tree.
     * @return List<T>
     *         returns all the values in the tree from bottom
     *         to top, i.e from the leaves.
     */
    public List<T> PostOrder(Node<T> node) {

        var output = new ArrayList<T>();

        this.PostOrderWork(node, output);

        return output;

    }

    /**
     * @param node
     *             Initially this node represents the root of the tree.
     * @return List<T>
     *         returns all the values from the left subtree of the
     *         root,and then from the right subtree.
     */
    public List<T> PreOrder(Node<T> node) {

        var output = new ArrayList<T>();

        this.PreOrderWork(node, output);

        return output;
    }

    /**
     * @param Nodenode
     * @return List<T>
     */
    public List<T> LevelOrder(Node<T> node) {

        var output = new ArrayList<T>();

        this.LevelOrderWork(node, output);

        return output;
    }

    /**
     * Traverses the tree in a "breadth" manner, that is
     * a level at a time from the root.
     * 
     * @param node
     *               Initially this node represents the root of the tree.
     * @param output
     */
    private void InOrderWork(Node<T> node, List<T> output) {

        if (node == null)
            return;

        output.add(node.getData());

        InOrderWork(node.getLeftChild(), output);

        InOrderWork(node.getRightChild(), output);
    }

    /**
     * @param node
     *               Initially this node represents the root of the tree.
     * @param output
     */
    private void PostOrderWork(Node<T> node, List<T> output) {

        if (node == null)
            return;

        PreOrderWork(node.getLeftChild(), output);

        PreOrderWork(node.getRightChild(), output);

        output.add(node.getData());
    }

    /**
     * @param node
     *               Initially this node represents the root of the tree.
     * @param output
     */
    private void PreOrderWork(Node<T> node, List<T> output) {

        if (node == null)
            return;

        output.add(node.getData());

        PreOrderWork(node.getLeftChild(), output);

        PreOrderWork(node.getRightChild(), output);
    }

    /**
     * Traverses the tree in a "breadth" manner, that is
     * a level at a time from the root.
     * 
     * @param node
     *               Initially this node represents the root of the tree.
     * @param output
     */
    private void LevelOrderWork(Node<T> node, List<T> output) {

        Queue<Node<T>> queue = new LinkedList<Node<T>>();

        queue.add(node);

        while (queue.size() > 0) {
            var current = queue.remove();

            if (current == null)
                continue;

            output.add(current.getData());

            queue.add(current.getLeftChild());

            queue.add(current.getRightChild());
        }

    }

}