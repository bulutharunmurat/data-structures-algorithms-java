package sentinelLinkedList;

import java.util.Objects;

public class SentinelLinkedList {

    Node head;

    public SentinelLinkedList() {
        this.head = new Node(null);
        this.head.next = this.head;
    }

    public void add(Integer data, Integer prev) {
        Node node = new Node(data);

        Node prevNode = find(prev);
        addBetween(prevNode, node);

    }

    public void add(Integer data) {
        Node node = new Node(data);

        Node prev = find(null);
        addBetween(prev, node);
    }

    private Node find(Integer data) {
        Node p = head;

        if (Objects.isNull(data)) {
            return p;
        }

        p = head;

        while (p.next != head) {
            if (p.next.data == data) {
                return p.next;
            }
            p = p.next;
        }
        return p;
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
        removeBetween(removeNode, prevNode);
    }

    public void removeBetween(Node removeNode, Node prevNode) {
        prevNode.next = removeNode.next;
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

        if (head.next == head) {
            return "[ ]";
        }

        String s = "[ ";
        Node p = head;

        while (p.next != head) {
            s = s + p.next.data + " ";
            p = p.next;
        }
        return s + "]";
    }
}
