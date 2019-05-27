package module4.classwork;


import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingAlgorithm {

    public static void main(String[] args) {
        int[] unsorted1 = {2, 6, 1, 9, 8, 7, 10, 6, 2};
        int[] unsorted2 = {2, 6, 1, 9, 8, 7, 10, 5, 2, 1};
        int[] unsorted3 = {7, 5, 9, 2, 1, 4, 6, 3, 8, 0};
        int[] sortedArray = bubbleSort(unsorted1);
        System.out.println("Bubble Sorting");
        System.out.println(Arrays.toString(sortedArray));
        int[] reverseBubbleSorted = reversedBubbleSort(unsorted1);
        System.out.println("Reverse Bubble Sorting");
        System.out.println(Arrays.toString(reverseBubbleSorted));
        int[] insertionSorted = insertionSort(unsorted2);
        System.out.println("Insertion Sorting");
        System.out.println(Arrays.toString(insertionSorted));
        int[] reverseInsertionSorted = reversedInsertionSort(unsorted2);
        System.out.println("Reverse Insertion Sorting");
        System.out.println(Arrays.toString(reverseInsertionSorted));


    }

    static int[] bubbleSort(int[] unsorted) {
        int[] sorted = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            sorted[i] = unsorted[i];
        }
        Boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] > sorted[i + 1]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    isSorted = true;
                }
            }
        }
        return sorted;
    }

    static int[] insertionSort(int[] unsorted) {
        int[] sorted = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            sorted[i] = unsorted[i];
        }

        for (int i = 1; i < sorted.length; i++) {
            for (int y = i; y > 0; y--)
                if (sorted[y] < sorted[y - 1]) {
                    int temp = sorted[y];
                    sorted[y] = sorted[y - 1];
                    sorted[y - 1] = temp;
                } else {
                    break;
                }
        }
        return sorted;
    }


    static int[] reversedInsertionSort(int[] unsorted) {
        int[] sorted = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            sorted[i] = unsorted[i];
        }

        for (int i = 1; i < sorted.length; i++) {
            for (int y = i; y > 0; y--)
                if (sorted[y] > sorted[y - 1]) {
                    int temp = sorted[y];
                    sorted[y] = sorted[y - 1];
                    sorted[y - 1] = temp;
                } else {
                    break;
                }
        }
        return sorted;
    }


    static int[] reversedBubbleSort(int[] unsorted) {
        int[] sorted = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            sorted[i] = unsorted[i];
        }
        Boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] < sorted[i + 1]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    isSorted = true;
                }
            }
        }
        return sorted;
    }}
