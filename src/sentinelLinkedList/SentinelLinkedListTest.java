package sentinelLinkedList;

public class SentinelLinkedListTest {
    public static void main(String[] args) {



        SentinelLinkedList sentinelLinkedList = new SentinelLinkedList();

        sentinelLinkedList.add(10);
        sentinelLinkedList.add(2);
        sentinelLinkedList.add(4,2);
        sentinelLinkedList.add(6,4);
        sentinelLinkedList.add(12,10);
        System.out.println(sentinelLinkedList);

        sentinelLinkedList.remove(-1);
        System.out.println(sentinelLinkedList);

        sentinelLinkedList.remove(12);
        System.out.println(sentinelLinkedList);

        sentinelLinkedList.remove(2);
        System.out.println(sentinelLinkedList);

        sentinelLinkedList.remove(6);
        System.out.println(sentinelLinkedList);

        sentinelLinkedList.remove(4);
        System.out.println(sentinelLinkedList);

        sentinelLinkedList.remove(10);
        System.out.println(sentinelLinkedList);

    }
}
