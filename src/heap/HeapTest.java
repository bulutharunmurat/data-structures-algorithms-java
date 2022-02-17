package heap;

public class HeapTest {
    public static void main(String[] args) {

        /*
        with indice i:
        childs:     2i + 1, 2i + 2
        parent:     round((i-1)/2)
        */

        MaxHeap maxHeap = new MaxHeap();
        maxHeap.add(15);
        maxHeap.add(10);
        maxHeap.add(12);
        maxHeap.add(5);
        maxHeap.add(4);
        maxHeap.add(3);
        maxHeap.add(17);
        maxHeap.add(11);
        maxHeap.add(9);

        System.out.println(maxHeap.heap);
        maxHeap.remove(15);
        System.out.println(maxHeap.heap);
        maxHeap.remove(55);
        System.out.println(maxHeap.heap);
        maxHeap.remove(5);
        System.out.println(maxHeap.heap);
        maxHeap.remove(11);
        System.out.println(maxHeap.heap);
        maxHeap.remove(4);
        System.out.println(maxHeap.heap);
        maxHeap.remove(10);
        System.out.println(maxHeap.heap);
        maxHeap.remove(17);
        System.out.println(maxHeap.heap);
        maxHeap.remove(9);
        System.out.println(maxHeap.heap);
        maxHeap.remove(3);
        System.out.println(maxHeap.heap);
        maxHeap.remove(12);
        System.out.println(maxHeap.heap);
    }
}
