package stack;

public class StackDemo {

    public static void main(String[] args) throws Exception {
        Stack_ stack = new Stack_(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack);
        stack.push(55);
        System.out.println(stack);
        stack.push(55);
        System.out.println(stack);
        stack.clear();
        System.out.println(stack);
        stack.push(55);
        stack.push(55);
        System.out.println(stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack);




    }


}
