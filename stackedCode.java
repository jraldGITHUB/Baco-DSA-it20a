import java.util.Stack;

public class stackedCode {

    public static void main(String[] args) {

        Stack<Integer> mystack = new Stack<>();
        

        mystack.push(10);
        mystack.push(20);
        mystack.push(30);

        System.out.println("Stack: " + mystack);


        int topElement = mystack.pop();
        System.out.println("Popped: " + topElement);
        

        int peekedElement = mystack.peek();
        System.out.println("Peeked: " + peekedElement);


        boolean isEmpty = mystack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);


        int stackSize = mystack.size();
        System.out.println("Stack Size: " + stackSize);
    }
}