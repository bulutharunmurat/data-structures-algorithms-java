package bubbleSort;

import java.util.Arrays;
import java.util.List;

import static bubbleSort.BubbleSort.sort;

public class BubbleSortTest {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(12, 4, 5, 7, 8, 234, 1, 0);
        sort(integerList);
        System.out.println(integerList);;


    }
}
