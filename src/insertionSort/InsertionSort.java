package insertionSort;

import java.util.List;

// BEST CASE n and WORST CASE = n(n+1)/2

public class InsertionSort {

    public static void  sort(List<Integer> aList) {
        for (int i = 0; i < aList.size(); i++) {
            int  temp = i;
            while (temp >= 1 && aList.get(temp-1) > aList.get(temp)) {

                Integer smaller = aList.get(temp);
                Integer greater = aList.get(temp - 1);

                aList.set(temp - 1, smaller);
                aList.set(temp, greater);

                temp = temp -1;
            }
        }
    }
}

// 1 4 5 234 2
// 1 4 5 234 2
// 1 4 5 234 2