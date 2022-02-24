package bubbleSort;

import java.util.List;

public class BubbleSort {


    public static void sort(List<Integer> aList) {

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < aList.size() - 1; i++) {
                if (aList.get(i + 1) < aList.get(i)) {

                    Integer smaller = aList.get(i + 1);
                    Integer greater = aList.get(i);

                    aList.set(i, smaller);
                    aList.set(i + 1, greater);

                    flag = true;
                }
            }
        }
    }
}

