package selectionSort;

import java.util.Arrays;
import java.util.List;

public class SelectionSortTest {
    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();

        List<Integer> integerList = Arrays.asList(12, 4, 5, 7, 8, 234, 1, 0);
        System.out.println(integerList);
        List<Integer> sortedList = selectionSort.sort(integerList);
        System.out.println(sortedList);
    }
}
