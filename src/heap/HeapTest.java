package heap;

public class HeapTest {
    public static void main(String[] args) {

        /*
        with indice i:
        childs:     2i + 1, 2i + 2
        parent:     round((i-1)/2)
        */

        MaxHeap maxHeap = new MaxHeap();
        maxHeap.add(15);    //0
        maxHeap.add(10);    //1
        maxHeap.add(12);    //2
        maxHeap.add(5);   //3
        maxHeap.add(4);   //4
        maxHeap.add(3);   //5
        maxHeap.add(17);
        maxHeap.add(11);
        maxHeap.add(9);


        System.out.println(maxHeap.heap);
        System.out.println(maxHeap.heap.size());
    }
}
