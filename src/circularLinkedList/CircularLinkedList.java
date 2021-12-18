package circularLinkedList;

import circularLinkedList.Node;

import java.util.Objects;

public class CircularLinkedList {

    Node head;
    Node tail;

    public CircularLinkedList() {
        this.head = null;
    }

    public void add(Integer data, Integer prev){
        Node node = new Node(data);

        if (head == null){
            addToEmptyList(node);
        }

        else {
            Node prevNode = find(prev);
            addToMiddle(prevNode, node);
            if (prev == null) {
                head = node;
            }
        }
    }

    public void add(Integer data){
        Node node = new Node(data);
        if (head == null){
            addToEmptyList(node);
        }
        Node prev = findPrev(data);
        addToMiddle(prev, node);
    }

    private Node find(Integer prev) {
        Node p = head;

        if (Objects.isNull(prev)) {
            while (p.next != head){
                p = p.next;
            }
            return p;
        }

        while (p.next != head){
            if (p.data == prev){
                return p;
            }
            p = p.next;
        }

        return p;
    }

    public void addToEmptyList(Node node){
        head = node;
        node.next = node;
    }


    public void addToMiddle(Node prev, Node node){
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
