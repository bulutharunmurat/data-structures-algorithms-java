package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MaxHeap {

     List<Integer> heap = new ArrayList<>();

     /*
     with indice i:
     childs:     2i + 1, 2i + 2
     parent:     round((i-1)/2)
     */

     public void add(Integer data) {

          heap.add(data);

          int curIndex = heap.size() - 1;
          Integer parentIndex = (curIndex - 1)/2;


          while (heap.get(parentIndex) < heap.get(curIndex)) {
               swap(heap, parentIndex, curIndex);
               curIndex = parentIndex;
               parentIndex = (curIndex - 1)/2;
          }
     }

     public void remove(Integer data) {

          Integer remIndex = findIndex(data);
          Integer lastIndex = heap.size() - 1;

          if (Objects.isNull(remIndex)) {
               System.out.println("list does not contain given data!!");
               return;
          }

          swap(heap, remIndex, lastIndex);
          heap.remove(lastIndex.intValue());

          while (remIndex < lastIndex && 2 * remIndex + 1 < lastIndex) {
               int leftChild = 2 * remIndex + 1;
               int rightChild = 2 * remIndex + 2;

               if (heap.get(remIndex) < heap.get(leftChild) || rightChild < lastIndex && heap.get(remIndex) < heap.get(rightChild)) {
                    if (rightChild < lastIndex && heap.get(leftChild) <= heap.get(rightChild)) {
                         swap(heap, remIndex, rightChild);
                         remIndex = rightChild;
                    } else {
                         swap(heap, remIndex, leftChild);
                         remIndex = leftChild;
                    }
               }
          }

     }

     public void swap(List<Integer> alist, Integer firstIndex, Integer secondIndex) {
          Integer firstIndexValue = alist.get(firstIndex);
          Integer secondIndexValue = alist.get(secondIndex);

          alist.set(firstIndex, secondIndexValue);
          alist.set(secondIndex, firstIndexValue);
     }

     public Integer findIndex(Integer data) {
          for (int i = 0; i < heap.size(); i++) {
               if (heap.get(i) == data) {
                    return i;
               }
          }
          return null;
     }

     public static List<Integer> heapify(List<Integer> alist) {
          MaxHeap heap = new MaxHeap();
          alist.forEach(heap::add);
          return heap.heap;
     }
}
