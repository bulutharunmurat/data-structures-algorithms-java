package linkedList;

import java.util.Objects;

public class LinkedList {

    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(Integer data, Integer prev){
        Node node = new Node(data);
        Node prevNode = find(prev);

        if (head == null){
            addToEmptyList(node);
        }

        else if (prevNode == tail) {
            addToTail(node);
        }

        else if (prevNode == null){
            addToHead(node);
        }

        else {
            addToMiddle(prevNode, node);
        }
    }

    public void add(Integer data){
        Node node = new Node(data);
        if (head == null){
            addToEmptyList(node);
        }
        addToTail(node);
    }

    private Node find(Integer prev) {
        if (Objects.isNull(prev)) {
            return null;
        }

        Node p = head;
        while (p != null){
            if (p.data == prev){
                return p;
            }
            p = p.next;
        }
        return null;
    }

    public void addToEmptyList(Node node){
        head = node;
        tail = node;
    }

    public void addToTail(Node node){
        tail.next = node;
        tail = node;
    }

    public void addToHead(Node node){
        node.next = head;
        head = node;
    }

    public void addToMiddle(Node prev, Node node){
        node.next = prev.next;
        prev.next = node;
    }

    @Override
    public String toString() {
        String s = "[ ";
        Node p = head;
        while (p != null){
            s = s + p.data + ", ";
            p = p.next;
        }

        s = s.substring(0, s.length() - 2) + " ]";
        return s;
    }
}
