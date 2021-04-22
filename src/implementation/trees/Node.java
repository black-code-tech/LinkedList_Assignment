package implementation.trees;

public class Node<T> {
    //The generic key for the node
    T key;

    //This represents the descendants of the node
    Node<T> left, right;

    // Constructor
    public Node(T item)
    {
        key = item;
        left = right = null;
    }
}
