package implementation.doublylinkedlist;

public class DLL<T> {
    Node<T> head;

    // This method will add a new node to the start of the list
    public void push(T data)
    {
        // Creating an instance of the node class
        // And pass the data as parameter
        Node<T> node = new Node<T>(data);

        // Assign the head(This class) to the next object(Node class)
        node.next = head;

        // Assign the Null to the prev object(Node class)
        node.prev = null;

        // Check if the head is not null
        if (head != null)
            // Assign the new Node instance to the prev object(Head of this class)
            head.prev = node;

        // let the head point to a new node
        head = node;
    }

    //This method will add a new data after a specified node
    public void InsertAfter(Node<T> prev_Node, T data)
    {

        // Check if the prev_Node parameter is null
        if (prev_Node == null) {
            //Output error message
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        // Creating an instance of the node class
        // And pass the data as parameter
        Node<T> node = new Node<T>(data);

        //Make the new node's(node) next as the previous node(prev_Node)
        node.next = prev_Node.next;

        // Make the previous node's(prev_Node) next as the new node(node)
        prev_Node.next = node;

        // Now make the previous node(prev_Node) as the new node(node)
        node.prev = prev_Node;

        //Check if new node's(node) next is not null
        if (node.next != null)
            // Now we change previous of the new node's(node) next node
            node.next.prev = node;
    }

    // This method will add a new node to the end of the list
    void append(T data)
    {
        // Creating a new instance of the node class
        // And pass the data as parameter
        Node<T> node = new Node<T>(data);

        // Create an instance of the node class (A helper)
        Node<T> last = head;

        //This is will be the last node. hence, it's next is to be null
        node.next = null;

        // Check if the list is empty
        if (head == null) {
            // Make the new node's(node) prev object null
            node.prev = null;

            // Make the new node as the head of the list
            head = node;
            return;
        }

        // If the list is not empty then we loop till the last node
        while (last.next != null)
            // Assigning the last node's next to the helper node (last)
            last = last.next;

        //Assigning the new node(node) to the last node's next
        last.next = node;

        // Assigning the last node to the new node's(node) previous
        node.prev = last;
    }

    // This method outputs the contents of the list from a given node
    public void Printlist(Node<T> node)
    {
        // Create an instance of the node class (A helper)
        Node<T> last = null;

        // Outputting mode of traversal
        System.out.println("Traversal in forward Direction");

        //Check if node is not null
        while (node != null) {
            //output the data of the node
            System.out.print(node.data + " ");
            // Assigning node to the helper node last
            last = node;

            // assign the next node of the node to itself
            node = node.next;
        }

        // Break line
        System.out.println();

        // Outputting mode of traversal
        System.out.println("Traversal in reverse direction");

        // Check if the helper node is not null
        while (last != null) {
            // output the data of the helper node
            System.out.print(last.data + " ");
            // assigning the previous node of the helper to itself
            last = last.prev;
        }
    }
}
