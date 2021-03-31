package implementation.stack;

public class DStack {
    int capacity = 2;
    int[] stack = new int[capacity];

    //A variable to represent the last element in the stack by index.
    int top = 0;

    //This method will add an element to the stack
    //It accepts accepts an integer as the parameter or element to be added.
    public void Push(int data) {
        //Checking if the stack is full
        if (Size() == capacity){
            //Feedback to the user
            Expand();
        }
        //Adding the parameter to the stack.
        stack[top] = data;

        //Increasing the the top variable by 1 to help add another element
        //In the right spot
        top++;
    }

    //This method will expand the array to twice it's size
    private void Expand() {
        //Assigning the size of the stack to a variable
        int length = Size();

        //Creating a new array with twice the size of the first.
        int[] newStack = new int[capacity*2];

        //Copying the elements in the old array into the new one.
        System.arraycopy(stack,0,newStack,0,length);

        //Copying the new stack to the old stack reference.
        stack = newStack;

        //Update the capacity variable.
        capacity *= 2;
    }

    //This method will remove the last element of the stack
    public void Pop() {
        //Checking if the stack is empty to prevent underflow exception
        if (IsEmpty()){
            //Feedback to the user
            System.out.println("The stack is empty...");
        }
        else{
            //The top value by nature is +1 of the actual value
            //hence we deduct 1
            top--;

            //Assigning the value to a local variable for output
            int data = stack[top];

            //Assigning 0 to the last index.
            stack[top] = 0;

            //Feedback
            System.out.println(data);

            Shrink();
        }

    }

    //This method will shrink the size of the stack.
    private void Shrink() {
        //Assigning the size of the stack to a variable.
        int length = Size();

        //checking if the length and the capacity are equal or less.
        if (length <= (capacity/2)/2){
            capacity = capacity/2;

            //Creating a new array with dynamic size.
            int[] newStack = new int[capacity];

            //Copying the elements in the old array into the new one.
            System.arraycopy(stack,0,newStack,0,length);

            //Copying the new stack to the old stack reference.
            stack = newStack;
        }
    }

    //This method will display the last element in the stack
    public void Peek() {

        //Fetching the last element
        int data = stack[top - 1];

        //Feedback
        System.out.println(data);
    }

    //This boolean method checks if the stack is empty and return the appropriate
    // boolean value.
    public boolean IsEmpty() {
        //Returning value
        return top <= 0;
    }

    //This method will tell the size of the stack
    public int Size(){
        //Returning the value
        return top;
    }

    //This method will display all the elements of the stack.
    public void Show() {
        //Looping through all the elements of the stack
        for (int n : stack)
        {
            //Feedback
            System.out.print(n + " ");
        }

        //Line break
        System.out.println("");
    }

}
