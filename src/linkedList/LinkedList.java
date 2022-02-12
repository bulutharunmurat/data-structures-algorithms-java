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
            addBetween(prevNode, node);
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

    public void addBetween(Node prev, Node node){
        node.next = prev.next;
        prev.next = node;
    }

    public void remove(Integer data){
        Node removeNode = find(data);

        if (removeNode == null){
            System.out.println("Node to remove cannot find in a list");
            return;
        }
        Node prevNode = findPrev(data);

        if (removeNode == tail && removeNode == head){
            removeToEmpty();
        }
        else if (removeNode == head){
            removeHead();
        }
        else if (removeNode == tail){
            removeTail(prevNode);
        }
        else {
            removeBetween(removeNode, prevNode);
        }

    }

    public void removeBetween(Node removeNode, Node prevNode){
        prevNode.next = removeNode.next;
    }

    public void removeHead(){
        head = head.next;
    }

    public void removeTail(Node prevNode){
        tail = prevNode;
        prevNode.next = null;
    }

    public void removeToEmpty(){
        head = null;
        tail = null;
    }

    private Node findPrev(Integer data) {
        Node p = head;
        while (p != null){
            if (Objects.nonNull(p.next) && (p.next.data == data)){
                return p;
            }
            p = p.next;
        }
        return null;
    }


    @Override
    public String toString() {
        String s = "[ ";
        Node p = head;
        while (p != null){
            s = s + p.data + ", ";
            p = p.next;
        }
        if (head != null){
            s = s.substring(0, s.length() - 2) + " ]";
        }
        else {
            s = s + " ]";
        }
        return s;
    }
}
