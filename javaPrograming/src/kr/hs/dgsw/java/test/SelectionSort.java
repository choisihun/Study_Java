package kr.hs.dgsw.java.test;

public class SelectionSort {
    public int[] sort(int[] unsorted) {
        return this.doSelectionSorting(unsorted);
    }
    private int[] doSelectionSorting(int[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < unsorted[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = unsorted[minIndex];
            unsorted[minIndex] = unsorted[i];
            unsorted[i] = temp;
        }
        return unsorted;
    }
}

