public class StackOfInteger {

    private int[] elements;
    private int size=0;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfInteger(){
        this.elements = new int[DEFAULT_CAPACITY];
    }

    public StackOfInteger(int capacity){
        this.elements = new int[capacity];
    }

    //Push a new integer to the top of the stack
    public void push(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length *2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size] = value;
        size++;
    }

    //Return and remove the top element from the stack
    public void pop(){
        size--;
        elements[size]=0;
        //return elements[--size];
    }

    //Return the top element from the stack
    public int peek(){
        return elements[size -1];
    }

    //Test whether the stack is empty
    public boolean empty(){
        return size ==  0;
    }


    //Return the number of elements in the stack
    public int getSize(){
        return size;
    }

    public int[] getElements() {
        return elements;
    }

}
