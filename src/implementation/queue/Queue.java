package implementation.queue;

public class Queue {
    int[] queue = new int[5];
    int size;
    int rear;
    int front;

    public void Enqueue(int data){
        queue[rear] = data;
        rear++;
        size++;
    }

    //This method will display all the elements of the queue.
    public void Show() {

        System.out.print("Elements : ");
        //Looping through all the elements of the stack
        for (int n = 0; n < size; n++)
        {
            //Feedback
            System.out.print(queue[n] + " ");
        }

        //Line break
        System.out.println("");
    }
}
