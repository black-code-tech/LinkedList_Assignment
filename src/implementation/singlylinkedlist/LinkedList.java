package implementation.singlylinkedlist;

public class LinkedList {
    // The object head of the linked list
    Node head;

    // This method will add a new node to the start of the list
    public void insertAtStart(int data)
    {
        // Creating an instance of the Node object
        Node node = new Node();

        // Assign the parameter to the node object data
        node.data = data;

        // Make the head its next node
        node.next = head;

        // Set the current node as the head
        head = node;
    }

    // This method will add a new node at a preferred location of the list
    public void insertAt(int index, int data)
    {
        // Creating an instance of the Node object
        Node node = new Node();

        // Assign the parameter to the node object data
        node.data = data;

        // By default the next value is nul;
        node.next = null;

        //Check if the preferred index is zero
        if (index == 0)
        {
            // Refer to the insertAtStart
            insertAtStart(data);
        }
        else {
            // Assign the head to a new node object for iteration
            Node n = head;

            // Iterate till the last node
            for (int i = 0; i < index - 1; i++) {
                // Move to the next node since it's reference is not null
                n = n.next;
            }

            // Assign the node at the index as the next node of the current index
            node.next = n.next;
            n.next = node;
        }
    }

    // This method will remove a node at a preferred location from the list
    public void deleteAt(int index)
    {
        // Check if the index is the head
       if (index == 0)
       {
           // Assign the head to the next node of the itself.
           head = head.next;
       }
       else{
           // Assign the head to a new node object for iteration
           Node n = head;

           // A helper object
           Node n1 = null;

           // Iterate till the index - 1 of the list
           for (int i = 0; i < index - 1; i++) {

               // Assign the next pointer to the current
               n = n.next;
           }

           // Assign the next node of the current node to the helper object
           n1 = n.next;

           n.next = n1.next;

           n1 = null;
       }

    }

    // This method will add a new node to the end of the list
    public void insert(int data)
    {
        // Creating an instance of the Node object
        Node node = new Node();

        // Assign the parameter to the node object data
        node.data = data;

        // By default the next value is nul;
        node.next = null;

        //Check if head is null or the current node is the first node
        if (head == null)
        {
            //Make the first node the head
            head = node;
        }
        // Look for the last node
        else{
            // Assign the head to a new node object for iteration
            Node n = head;

            // Iterate till the last node
            while (n.next != null)
            {
                // Move to the next node since it's reference is not null
                n = n.next;
            }

            // Add node the list
            n.next = node;
        }
    }

    // This method will display all nodes in the list
    public void show()
    {
        // Assign the head of the list to a new object of the node class
        Node node = head;

        // Iterate till the last node
        while (node.next != null)
        {
            // Display the node's data
            System.out.println(node.data);

            // Move to the next node
            node = node.next;
        }

        // Display the last node of the list since it's reference will be null,
        // and hence will not be display in the above loop.
        System.out.println(node.data);
    }
}
