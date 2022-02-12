package circularLinkedList;

import java.util.Objects;

public class CircularLinkedList {

    Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void add(Integer data, Integer prev) {
        Node node = new Node(data);

        if (head == null) {
            addToEmptyList(node);
        } else {
            Node prevNode = find(prev);
            addBetween(prevNode, node);
        }
    }

    public void add(Integer data) {
        Node node = new Node(data);
        if (head == null) {
            addToEmptyList(node);
        }
        Node prev = find(null);
        addBetween(prev, node);
        head = node;
    }

    private Node find(Integer data) {
        Node p = head;

        if (Objects.isNull(data)) {
            while (p.next != head) {
                p = p.next;
            }
            return p;
        }

        while (p.next != head) {
            if (p.data == data) {
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


    public void addBetween(Node prev, Node node) {
        node.next = prev.next;
        prev.next = node;
    }

    public void remove(Integer data) {
        Node removeNode = find(data);

        if (removeNode.data != data){
            System.out.println("Node to remove cannot find in a list");
            return;
        }
        Node prevNode = findPrev(removeNode);

        if (removeNode == prevNode) {
            removeToEmpty();
        } else {
            if (removeNode == head) {
                head = removeNode.next;
            }
            removeBetween(removeNode, prevNode);
        }

    }

    public void removeBetween(Node removeNode, Node prevNode) {
        prevNode.next = removeNode.next;
    }

    public void removeToEmpty() {
        head = null;
    }

    private Node findPrev(Node selfNode) {
        Node p = selfNode;
        while (p.next != selfNode){
            p = p.next;
        }
        return p;
    }


    @Override
    public String toString() {

        if (head == null) {
            return "[ ]";
        }

        String s = "[ ";
        Node p = head;

        while (p.next != head) {
            s = s + p.data + ", ";
            p = p.next;
        }
        return s + p.data + " ]";
    }
}
