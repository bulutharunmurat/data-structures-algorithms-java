package sentinelDoubleLinkedList;

import java.util.Objects;

public class SentinelDoubleLinkedList {

    DoubleNode head;

    public SentinelDoubleLinkedList() {
        this.head = new DoubleNode(null);
        this.head.next = this.head;
        this.head.prev = this.head;
    }

    public void add(Integer data, Integer prev) {
        DoubleNode doubleNode = new DoubleNode(data);

        DoubleNode prevDoubleNode = find(prev);
        addBetween(prevDoubleNode, doubleNode);

    }

    public void add(Integer data) {
        DoubleNode doubleNode = new DoubleNode(data);

        DoubleNode prev = find(null);
        addBetween(prev, doubleNode);
    }

    private DoubleNode find(Integer data) {
        DoubleNode p = head;

        if (Objects.isNull(data)) {
            return p;
        }

        while (p.next != head) {
            if (p.next.data == data) {
                return p.next;
            }
            p = p.next;
        }
        return p;
    }

    public void addBetween(DoubleNode prev, DoubleNode newNode) {
        newNode.next = prev.next;
        newNode.prev = prev;
        newNode.next.prev = newNode;
        prev.next = newNode;
    }

    public void remove(Integer data) {
        DoubleNode removeDoubleNode = find(data);

        if (removeDoubleNode.data != data){
            System.out.println("Node to remove cannot find in a list");
            return;
        }

        DoubleNode prevDoubleNode = removeDoubleNode.prev;
        removeBetween(removeDoubleNode, prevDoubleNode);
    }

    public void removeBetween(DoubleNode removeDoubleNode, DoubleNode prevDoubleNode) {
        removeDoubleNode.prev.next = removeDoubleNode.next;
        removeDoubleNode.next.prev = removeDoubleNode.prev;
    }

    @Override
    public String toString() {

        if (head.next == head) {
            return "[ ]";
        }

        String s = "[ ";
        DoubleNode p = head;

        while (p.next != head) {
            s = s + p.next.data + " ";
            p = p.next;
        }
        return s + "]";
    }
}
