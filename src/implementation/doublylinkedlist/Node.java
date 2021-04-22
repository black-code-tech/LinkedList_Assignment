package implementation.doublylinkedlist;

public class Node<T> {
    T data;
    Node prev;
    Node next;

    // Constructor to create a new node
    Node(T incomingData) {

        //Assigning the incoming data to our data object
        data = incomingData;
    }
}
