package sentinelDoubleLinkedList;

public class SentinelDoubleLinkedListTest {
    public static void main(String[] args) {



        SentinelDoubleLinkedList sentinelDoubleLinkedList = new SentinelDoubleLinkedList();

        sentinelDoubleLinkedList.add(10);
        sentinelDoubleLinkedList.add(2);
        sentinelDoubleLinkedList.add(4,2);
        sentinelDoubleLinkedList.add(6,4);
        sentinelDoubleLinkedList.add(12,10);
        System.out.println(sentinelDoubleLinkedList);

        sentinelDoubleLinkedList.remove(-1);
        System.out.println(sentinelDoubleLinkedList);

        sentinelDoubleLinkedList.remove(12);
        System.out.println(sentinelDoubleLinkedList);

        sentinelDoubleLinkedList.remove(2);
        System.out.println(sentinelDoubleLinkedList);

        sentinelDoubleLinkedList.remove(6);
        System.out.println(sentinelDoubleLinkedList);

        sentinelDoubleLinkedList.remove(4);
        System.out.println(sentinelDoubleLinkedList);

        sentinelDoubleLinkedList.remove(10);
        System.out.println(sentinelDoubleLinkedList);

    }
}
