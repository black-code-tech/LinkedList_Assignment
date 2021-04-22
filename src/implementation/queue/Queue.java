package implementation.queue;

public class Queue<T> {
    // Fields

    //The capacity of the list
    int capacity = 5;

    //The generic array
    T[] queue = (T[])new Object[capacity];

    //The size of the array
    int size;

    //The last item of the list
    int rear;

    //The first item of the list
    int front;

    //This method will add an element to the list
    public void Enqueue(T data){
        //Check if the list if full
        if (isFull()) {
            System.out.println("The queue is full");
            return;
        }
        // Assigning data to the rear of the queue
        queue[rear] = data;
        rear = (rear + 1) % capacity;
        size++;
        System.out.println(data + " enqueued to queue");
    }

    //This method will remove an element from the list
    public void Dequeue(){
        //Check if the list empty
        if(isEmpty()) {
            System.out.println("The list is empty");
            return;
        }

        T data = queue[front];
        front = (front +1) % capacity;
        size--;
        System.out.println(data + " dequeued from queue");
    }

    public int GetSize(){
        return size;
    }

    // This method checks if the list is full
    public boolean isFull()
    {
        return GetSize() == capacity;
    }

    // This method check if the Queue is empty when size is 0
    public boolean isEmpty()
    {
        return GetSize() == 0;
    }

    // Method to get front of queue
    public T Front()
    {
        if (isEmpty())
            System.out.println("The list is empty");

        return queue[front];
    }

    // Method to get rear of queue
    public T Rear()
    {
        if (isEmpty())
            System.out.println("The list is empty");

        return queue[rear];
    }

    //This method will display all the elements of the queue.
    public void Show() {

        System.out.print("Elements : ");
        //Looping through all the elements of the stack
        for (int n = 0; n < size; n++)
        {
            //Feedback
            System.out.print(queue[(front + n) % capacity] + " ");
        }

        //Line break
        System.out.println("");
    }
}
