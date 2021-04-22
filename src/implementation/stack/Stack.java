package implementation.stack;

public class Stack<T> {

    T[] stack = (T[])new Object[5];

    //A variable to represent the last element in the stack by index.
    int top = 0;

    //This method will add an element to the stack
    //It accepts accepts an integer as the parameter or element to be added.
    public void Push(T data) {
        //Checking if the stack is full(i.e using a limited array)
        if (top == 5){
            //Feedback to the user
            System.out.println("The stack is full...");
        }
        else{
            //Adding the parameter to the stack.
            stack[top] = data;

            //Increasing the the top variable by 1 to help add another element
            //In the right spot
            top++;
        }
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
            T data = stack[top];

            //Assigning 0 to the last index.
            stack[top] = null;

            //Feedback
            System.out.println(data);
        }

    }

    //This method will display the last element in the stack
    public void Peek() {

        //Fetching the last element
        T data = stack[top - 1];

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
        for (T n : stack)
        {
            //Feedback
            System.out.print(n + " ");
        }

        //Line break
        System.out.println("");
    }

}
