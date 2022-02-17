package heap;

import java.util.ArrayList;
import java.util.List;

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

     public void swap(List<Integer> alist, Integer firstIndex, Integer secondIndex) {

          Integer firstIndexValue = alist.get(firstIndex);
          Integer secondIndexValue = alist.get(secondIndex);

          alist.set(firstIndex, secondIndexValue);
          alist.set(secondIndex, firstIndexValue);

     }


}
