package implementation.singlylinkedlist;

public class Main {
    public static void main(String[] args) {
        //Creating an instance of the Linked list class
       /* LinkedList<Integer> list = new LinkedList<Integer>();

        list.insert(8);
        list.insert(10);
        list.insert(12);
        list.insert(16);
        list.insert(9);
        list.insert(14);
        list.insertAtStart(15);
        list.insertAt(4,25);
        list.deleteAt(5);
        list.insertAt(4,30);
        list.insert(45);
        list.deleteAt(1);*/

        LinkedList<String> list = new LinkedList<String>();

        list.insert("8");
        list.insert("10");
        list.insert("D");
        list.insert("16");
        list.insert("I");
        list.insert("E");
        list.insertAtStart("15");
        list.insertAt(4,"N");
        list.deleteAt(5);
        list.insertAt(4,"A");
        list.insert("L");
        list.deleteAt(1);

        list.show();
    }
}
