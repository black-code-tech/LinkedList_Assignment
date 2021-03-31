package implementation.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.Enqueue(5);
        queue.Enqueue(69);
        queue.Enqueue(8);

        queue.Show();
    }
}
