package implementation.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);

        queue.Show();

        queue.Dequeue();

        queue.Enqueue(70);
        queue.Enqueue(80);
        queue.Enqueue(90);

        System.out.println("Front item is " + queue.Front());

        System.out.println("Size is " + queue.GetSize());

        queue.Show();

    }
}
