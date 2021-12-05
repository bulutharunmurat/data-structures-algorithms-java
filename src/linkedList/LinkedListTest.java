package linkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2,1);
        linkedList.add(4);

        linkedList.remove(1);
        System.out.println(linkedList);

        linkedList.remove(3);
        System.out.println(linkedList);

        linkedList.remove(4);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);


        System.out.println(linkedList);

    }
}
