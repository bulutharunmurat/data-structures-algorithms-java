package queue;

public class QueueDemo {
    public static void main(String[] args) throws Exception {
        Queue_ queue = new Queue_(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue);


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue);



    }
}
