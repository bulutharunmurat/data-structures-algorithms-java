package stack;

public class StackDemo {

    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
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



    }


}
