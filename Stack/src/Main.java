public class Main {

    public static void main(String[] args){

        StackOfInteger testStackInt = new StackOfInteger();

        System.out.println("Total elements:" + testStackInt.getElements().length);

        System.out.println("With the current size in the stack is: " + testStackInt.getSize());

        testStackInt.push(1);
        testStackInt.push(2);
        testStackInt.push(3);
        testStackInt.push(4);

        //System.out.println(testStackInt.getElements()[1]);
        //System.out.println("PEEK() "+testStackInt.peek());
        //System.out.println("POP(): "+testStackInt.pop());
        testStackInt.pop();
        //System.out.println(testStackInt.getElements()[3]);

        for(int i = 0; i < testStackInt.getElements().length; i++){
            System.out.println(testStackInt.getElements()[i]);
        }

    }
}
