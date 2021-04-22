package implementation.stack;

public class Main {
    public static void main(String[] args) {
        DStack<Integer> stack = new DStack<Integer>();
//        Stack<Integer> stack = new Stack<Integer>();

        stack.Push(15);
        stack.Push(8);
        stack.Show();

//        stack.Peek();
        stack.Push(10);
        stack.Show();

        stack.Push(18);
        stack.Show();

        stack.Push(20);
        stack.Show();

        stack.Push(33);
//        int size = stack.Size();
//        stack.Pop();
        stack.Show();

        stack.Pop();
        stack.Show();
        stack.Pop();
        stack.Show();
        stack.Pop();
        stack.Show();
        stack.Pop();
        stack.Show();
        stack.Pop();
        stack.Show();
    }
}
