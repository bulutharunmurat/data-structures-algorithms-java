package linkedList;

public class LinkedList {

    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public Integer addToEmptyList(Integer data){
        Node node = new Node(data);
        head = node;
        tail = node;

        return node.data;
    }
}
