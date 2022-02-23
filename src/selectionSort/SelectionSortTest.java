package selectionSort;

import java.util.Arrays;
import java.util.List;

import static selectionSort.SelectionSort.sort;

public class SelectionSortTest {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(12, 4, 5, 7, 8, 234, 1, 0);
        System.out.println(integerList);
        List<Integer> sortedList = sort(integerList);
        System.out.println(sortedList);
    }
}
