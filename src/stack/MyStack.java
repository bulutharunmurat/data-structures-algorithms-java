package stack;

public class MyStack {

    private Integer top = -1;
    private Integer capacity;
    private Integer[] array;

    public MyStack(Integer capacity) {
        this.capacity = capacity;
        this.array = new Integer[capacity];
    }

    public void push(Integer variable) throws Exception {
        if (!isFull() ) {
            top = top + 1;
            array[top] = variable;
        }
        else {
            throw new Exception("Stack is Full!");
        }
    }

    public Integer pop() throws Exception {
        if (!isEmpty()) {
            Integer val = array[top];
            top = top - 1;
            return val;
        }
        throw new Exception("Stack is Empty");
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public void clear(){
        top = -1;
    }

    public Integer peek(){
        return array[top];
    }

    @Override
    public String toString() {

        String stack = "";

        for (int i = 0; i <= top; i++){
            stack = stack + array[i] + ", ";
        }
        return "MyStack{" +
                "top=" + top +
                ", capacity=" + capacity +
                ", array=" + stack +
                '}';
    }
}
