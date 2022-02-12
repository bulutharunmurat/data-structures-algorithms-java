package circularLinkedList;

public class CircularLinkedListTest {
    public static void main(String[] args) {


        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(10);
        circularLinkedList.add(2);
        circularLinkedList.add(4,2);
        circularLinkedList.add(6,4);
        circularLinkedList.add(12,10);
        System.out.println(circularLinkedList);


        circularLinkedList.remove(-1);
        System.out.println(circularLinkedList);

        circularLinkedList.remove(12);
        System.out.println(circularLinkedList);

        circularLinkedList.remove(2);
        System.out.println(circularLinkedList);

        circularLinkedList.remove(6);
        System.out.println(circularLinkedList);

        circularLinkedList.remove(4);
        System.out.println(circularLinkedList);

        circularLinkedList.remove(10);
        System.out.println(circularLinkedList);


    }
}
