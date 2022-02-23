package selectionSort;

import java.util.List;

// BEST CASE and WORST CASE = n(n+1)/2

public class SelectionSort {

    public static List<Integer> sort(List<Integer> aList) {
        for (int i = 0; i < aList.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < aList.size(); j++) {
                if (aList.get(minIndex) > aList.get(j)) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int curValue = aList.get(i);
                int minValue = aList.get(minIndex);

                aList.set(i, minValue);
                aList.set(minIndex, curValue);
            }

        }

        return aList;
    }
}
