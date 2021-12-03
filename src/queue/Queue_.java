package queue;

public class Queue_ {

    private Integer front = 0;
    private Integer rear = -1;
    private Integer capacity;
    private Integer[] array;
    private Integer count = 0;

    public Queue_(Integer capacity) {
        this.capacity = capacity;
        this.array = new Integer[capacity];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == capacity;
    }

    public void enqueue(Integer variable){
        if (!isFull()){
            count = count + 1;
            rear = (rear + 1) % capacity;
            array[rear] = variable;
        }
    }

    public Integer dequeue() throws Exception {
        if (!isEmpty()){
            count = count - 1;
            Integer variable = array[front];
            front = (front + 1) % capacity;
            array[rear] = variable;
            return variable;
        }
        throw new Exception("Stack is Full");
    }

    public void clear(){
        rear = -1;
        front = 0;
    }

    @Override
    public String toString() {

        String queue = "";

        for (int i = 0; i <= count; i++){
            queue = queue + array[(front + i) % capacity ] + ", ";
        }
        return "Queue_{" +
                "top=" + rear +
                ", capacity=" + capacity +
                ", array=" + queue +
                '}';
    }

}
